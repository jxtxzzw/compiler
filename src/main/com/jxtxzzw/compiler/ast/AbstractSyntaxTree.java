package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Function;
import com.jxtxzzw.compiler.symboltable.SymbolTable;
import com.jxtxzzw.compiler.type.BaseType;
import com.jxtxzzw.compiler.type.Void;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.jxtxzzw.compiler.type.Int;
import resources.CXLexer;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;

public class AbstractSyntaxTree {

    private static SymbolTable symbolTable = new SymbolTable();

    public static ArrayList<Statement> buildProgram(ParseTree tree) throws Exception {
        ArrayList<Statement> statements = new ArrayList<>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i).getChild(1), CXLexer.IDENTIFIER)) {
                statements.add(buildFunctionStatement(tree.getChild(i)));
            }
        }
        return statements;
    }

    public static Statement buildStatement(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.SEMICOLON)) {
            return new EmptyStatement();
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.RETURN)) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.VOID)) {
                return new EmptyStatement();
            } else {
                return buildReturnExpression(tree.getChild(1));
            }
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WRITE)) {
            return buildWriteExpression(tree.getChild(1));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WRITELN)) {
            return buildWritelnExpression(tree.getChild(1));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.IDENTIFIER)) {
            return buildDefinition(tree);
        }
        tree = tree.getChild(0);
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.SEMICOLON)) {
            return buildExpression(tree.getChild(0));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.IF)) {
            return buildIfElse(tree);
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.LEFTBRACE)) {
            CompoundStatement statements = new CompoundStatement();
            for (int i = 1; i < tree.getChildCount() - 1; i++) {
                statements.append(buildStatement(tree.getChild(i)));
            }
            return statements;
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WHILE)) {
            return buildWhileStatement(tree);
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.FOR)) {
            return buildForStatement(tree);
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.DO)) {
            return buildDoWhileStatement(tree);
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.REPEAT)) {
            return buildRepeatUntilStatement(tree);
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.SEMICOLON)) {
            return new EmptyStatement();
        }
        throw new Exception();
    }

    private static Statement buildWhileStatement(ParseTree tree) throws Exception {
        Expression condition = buildExpression(tree.getChild(2));
        Statement statement = buildStatement(tree.getChild(4));
        String beginLoopLabel = symbolTable.generateLoopLabel();
        String endLoopLabel = symbolTable.generateLoopLabel();
        return new WhileStatement(condition, false, statement, beginLoopLabel, endLoopLabel);
    }

    private static Statement buildForStatement(ParseTree tree) throws Exception {
        ParseTree[] expressionTree = new ParseTree[3];
        int cursor = 0;
        for (int i = 2; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.RIGHTPARENTHESIS)) {
                break;
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.SEMICOLON)) {
                cursor++;
            } else {
                expressionTree[cursor] = tree.getChild(i);
            }
        }
        Expression initialize = buildExpression(expressionTree[0]);
        Expression condition = buildExpression(expressionTree[1]);
        Expression step = buildExpression(expressionTree[2]);

        Statement statement = buildStatement(tree.getChild(tree.getChildCount() - 1));
        CompoundStatement loopBody = new CompoundStatement();
        loopBody.append(statement);
        loopBody.append(step);

        String beginLoopLabel = symbolTable.generateLoopLabel();
        String endLoopLabel = symbolTable.generateLoopLabel();

        Statement whileLoop = new WhileStatement(condition, false, loopBody, beginLoopLabel, endLoopLabel);

        CompoundStatement forLoop = new CompoundStatement();
        forLoop.append(initialize);
        forLoop.append(whileLoop);
        return forLoop;
    }

    private static Statement buildDoWhileStatement(ParseTree tree) throws Exception {
        Expression condition = buildExpression(tree.getChild(4));
        Statement statement = buildStatement(tree.getChild(1));
        String beginLoopLabel = symbolTable.generateLoopLabel();
        String endLoopLabel = symbolTable.generateLoopLabel();
        return new WhileStatement(condition, false, statement, beginLoopLabel, endLoopLabel);
    }

    private static Statement buildRepeatUntilStatement(ParseTree tree) throws Exception {
        Expression condition = buildExpression(tree.getChild(4));
        Statement statement = buildStatement(tree.getChild(1));
        String beginLoopLabel = symbolTable.generateLoopLabel();
        String endLoopLabel = symbolTable.generateLoopLabel();
        return new WhileStatement(condition, true, statement, beginLoopLabel, endLoopLabel);
    }

    private static Expression buildExpression(ParseTree tree) throws Exception {
        if (tree == null)
            return new EmptyExpression(new Void());
        return buildAssignmentExpression(tree.getChild(0));
    }

    private static Expression buildAssignmentExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.ASSIGN)) {
            String identifier = tree.getChild(0).getText();
            VariableExpression variableExpression = new VariableExpression(symbolTable.getSymbol(identifier));
            Expression expression = buildAssignmentExpression(tree.getChild(2));
            return new AssignmentExpression(variableExpression, expression);
        } else {
            return buildConditionalExpression(tree.getChild(0));
        }
    }

    private  static  Expression buildConditionalExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.QUESTIONMARK)) {
            throw new Exception();
        } else {
            return buildLogicalOrExpression(tree.getChild(0));
        }
    }

    private static Expression buildLogicalOrExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.LOGICALOR)) {
            return new LogicExpression(buildLogicalOrExpression(tree.getChild(0)), buildLogicalAndExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildLogicalAndExpression(tree.getChild(0));
        }
    }

    private static Expression buildLogicalAndExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.LOGICALAND)) {
            return new LogicExpression(buildLogicalAndExpression(tree.getChild(0)), buildInclusiveOrExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildInclusiveOrExpression(tree.getChild(0));
        }
    }

    private static  Expression buildInclusiveOrExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.IOR)) {
            return new LogicExpression(buildInclusiveOrExpression(tree.getChild(0)), buildExclusiveOrExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildExclusiveOrExpression(tree.getChild(0));
        }
    }

    private static Expression buildExclusiveOrExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.XOR)) {
            return new LogicExpression(buildExclusiveOrExpression(tree.getChild(0)), buildAndExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildAndExpression(tree.getChild(0));
        }
    }

    private  static  Expression buildAndExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.AND)) {
            return new LogicExpression(buildAndExpression(tree.getChild(0)), buildEqualityExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildEqualityExpression(tree.getChild(0));
        }
    }

    private  static  Expression buildEqualityExpression(ParseTree tree) throws Exception {
        final int[] TOKEN_SET = { CXLexer.EQUAL, CXLexer.NOTEQUAL};
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), TOKEN_SET)) {
            return new ComparisonExpression(buildEqualityExpression(tree.getChild(0)), buildRelationalExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildRelationalExpression(tree.getChild(0));
        }
    }

    private static  Expression buildRelationalExpression(ParseTree tree) throws Exception {
        final int[] TOKEN_SET = { CXLexer.LESSTHAN, CXLexer.GREATERTHAN, CXLexer.LESSTHANOREQUAL, CXLexer.GREATERTHANOREQUAL};
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), TOKEN_SET)) {
            return new ComparisonExpression(buildRelationalExpression(tree.getChild(0)), buildAddictiveExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildAddictiveExpression(tree.getChild(0));
        }
    }

    private static Expression buildAddictiveExpression(ParseTree tree) throws Exception {
        final int[] TOKEN_SET = { CXLexer.PLUS, CXLexer.MINUS};
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), TOKEN_SET)) {
            return new ArithmeticExpression(buildAddictiveExpression(tree.getChild(0)), buildMultiplicativeExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildMultiplicativeExpression(tree.getChild(0));
        }
    }

    private static Expression buildMultiplicativeExpression(ParseTree tree) throws Exception {
        final int[] TOKEN_SET = { CXLexer.MUL, CXLexer.DIV, CXLexer.MOD};
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), TOKEN_SET)) {
            return new ArithmeticExpression(buildMultiplicativeExpression(tree.getChild(0)), buildPostfixExpression(tree.getChild(2)), TokenJudgement.getToken(tree.getChild(1)));
        } else {
            return buildPostfixExpression(tree.getChild(0));
        }
    }

    private static Expression buildPostfixExpression(ParseTree tree) throws Exception {
        final int[] TOKEN_SET = { CXLexer.PLUSPLUS, CXLexer.MINUSMINUS};
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), TOKEN_SET)) {
            return new SelfIncrementExpression(buildPostfixExpression(tree.getChild(0)), TokenJudgement.getToken(tree.getChild(1)));
        } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.NOT)) {
            return buildLogicalNotExpression(tree.getChild(1));
        } else {
            return buildPrimaryExpression(tree.getChild(0));
        }
    }

    private static  Expression buildPrimaryExpression(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.IDENTIFIER)) {
            if (tree.getChildCount() > 1 && TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.LEFTPARENTHESIS)) {
                // function call
                return buildFunctionCallExpression(tree);
            } else {
                // var
                return buildVariableExpression(tree.getChild(0));
            }
        } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.LEFTPARENTHESIS)) {
            // (E)
            return buildExpression(tree.getChild(1));
        } else {
                // constant
            tree = tree.getChild(0);
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.NUMBER)) {
                return buildConstantExpression(tree);
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.TRUE)) {
                return buildBooleanExpression(true);
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.FALSE)) {
                return buildBooleanExpression(false);
            }
            throw new Exception();
        }
    }

    private static IfElseStatement buildIfElse(ParseTree tree) throws Exception {
        Expression condition = buildExpression(tree.getChild(2));
        Statement thenStatement = tree.getChildCount() > 4 ? buildStatement(tree.getChild(4)) : null;
        Statement elseStatement = tree.getChildCount() > 6 ? buildStatement(tree.getChild(6)) : null;
        String endElseLabel = symbolTable.generateIfElseLabel();
        String endIfLabel = symbolTable.generateIfElseLabel();
        return new IfElseStatement(condition, thenStatement, elseStatement, endElseLabel, endIfLabel);

    }

    private static ConstantExpression buildConstantExpression(ParseTree tree) {
        return new ConstantExpression(new Int(), tree);
    }

    private static BooleanExpression buildBooleanExpression(boolean b) {
        return new BooleanExpression(b);
    }

    private  static  FunctionCallExpression buildFunctionCallExpression(ParseTree tree) throws Exception {
        String identifier = tree.getChild(0).getText();
        ArrayList<Expression> parameters = new ArrayList<>();
        ArrayList<BaseType> parameterTypes = new ArrayList<>();
        for (int i = 2; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.RIGHTPARENTHESIS)) {
                break;
            }
            if (!TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.COMMA)) {
                Expression expression = buildExpression(tree.getChild(i));
                parameters.add(expression);
                parameterTypes.add(expression.getBaseType());
            }
        }
        Function function = symbolTable.getFunction(identifier, parameterTypes);
        return new FunctionCallExpression(function, parameters);
    }

    private static Statement buildFunctionStatement(ParseTree tree) throws Exception {
        BaseType returnType = new Int(); // TODO get return type from child 0
        String identifier = tree.getChild(1).getText();
        ArrayList<BaseType> parameterTypes = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();
        for (int i = 3; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.RIGHTPARENTHESIS)) {
                break;
            } else if (!TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.COMMA)) {
                String type = tree.getChild(i).getChild(0).getText();
                BaseType baseType= new Int(); // get BaseType from type
                parameterTypes.add(baseType);
                i++;
                String parameter = tree.getChild(i).getText();
                parameters.add(parameter);
            }
        }
        symbolTable.registerFunction(identifier, returnType, parameterTypes, parameters); // TODO
        Function function = symbolTable.getFunction(identifier, parameterTypes);
        ArrayList<Statement> statements = new ArrayList<>();
        symbolTable.openFunction(function);
        int index = 0;
        while (!(tree.getChild(index).getPayload() instanceof Token) || ((Token)(tree.getChild(index).getPayload())).getType() != CXLexer.LEFTBRACE) {
            index++;
        }
        index++;
        while (!(tree.getChild(index).getPayload() instanceof Token) || ((Token)(tree.getChild(index).getPayload())).getType() != CXLexer.RIGHTBRACE) {
            statements.add(buildStatement(tree.getChild(index)));
            index++;
        }
        symbolTable.closeFunction(function);
        return new FunctionStatement(function, statements);
    }

    public static Statement buildWriteExpression(ParseTree tree) throws Exception {
        return new WriteStatement(buildExpression(tree));
    }
    public static Statement buildWritelnExpression(ParseTree tree) throws Exception {
        return new WritelnStatement(buildExpression(tree));
    }

    public static DefinitionInitializationExpression buildDefinition(ParseTree tree) throws Exception {
        BaseType baseType = new Int();
        DefinitionInitializationExpression list = new DefinitionInitializationExpression(baseType);
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.IDENTIFIER)) {
                String identifier = tree.getChild(i).getText();
                symbolTable.registerSymbol(identifier, new Int());
                VariableExpression variableExpression = buildVariableExpression(tree.getChild(i));
                Expression initialValue;
                if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i + 1), CXLexer.ASSIGN)) {
                    initialValue = buildExpression(tree.getChild(i + 2));
                    i += 2;
                } else {
                    initialValue = null;
                }
                list.append(variableExpression, initialValue);
            }
        }
        return list;
    }

    public static VariableExpression buildVariableExpression(ParseTree tree) throws Exception {
        String identifier = tree.getText();
        return new VariableExpression(symbolTable.getSymbol(identifier));
    }

    private static ReturnExpression buildReturnExpression(ParseTree tree) throws Exception {
        return new ReturnExpression(buildExpression(tree));
    }

    private static Expression buildLogicalNotExpression(ParseTree tree) throws Exception {
        return new LogicNotExpression(buildPrimaryExpression(tree));
    }
}
