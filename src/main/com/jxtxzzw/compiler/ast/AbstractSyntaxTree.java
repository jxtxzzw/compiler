package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Function;
import com.jxtxzzw.compiler.symboltable.SymbolTable;
import com.jxtxzzw.compiler.type.BaseType;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.jxtxzzw.compiler.type.Int;
import resources.CXLexer;

import java.util.ArrayList;

public class AbstractSyntaxTree {

    private static SymbolTable symbolTable = new SymbolTable();

    public static ArrayList<Statement> buildProgeam(ParseTree tree) throws Exception {
        ArrayList<Statement> statements = new ArrayList<>();
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i).getChild(1), CXLexer.IDENTIFIER)) {
                statements.add(buildFunctionStatement(tree.getChild(i)));
            }
        }
        return statements;
        // TODO for/while ...
    }

    // TODO extract this token judgement to a single method
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

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.FOR)) {

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WRITE)) {
            return buildWriteExpression(tree.getChild(1));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WRITELN)) {
            return buildWritelnExpression(tree.getChild(1));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.ASSIGN)) {

        }
        throw new Exception();
    }

    private static Expression buildExpression(ParseTree tree) throws Exception {
        // TODO: token validation + decide the switch
        if (tree.getChildCount() >= 3) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.IDENTIFIER)
                    && (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.LEFTPARENTHESIS))
                    && (TokenJudgement.isTokenAndEqualTo(tree.getChild(tree.getChildCount() - 1), CXLexer.RIGHTPARENTHESIS))
            ) {
                return buildFunctionCallExpression(tree);
            }
        }
        if (tree.getChildCount() == 3) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.ASSIGN)) {
                return buildAssignmentExpression(tree);
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.LEFTPARENTHESIS)) {
                return buildFunctionCallExpression(tree);
            } else {
                final int[] COMPARISON = {CXLexer.EQUAL, CXLexer.NOTEQUAL, CXLexer.GREATERTHAN, CXLexer.LESSTHAN, CXLexer.GREATERTHANOREQUAL, CXLexer.LESSTHANOREQUAL};
                final int[] LOGIC = {CXLexer.AND, CXLexer.OR};
                if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), COMPARISON)) {
                    return buildComparisonExpression(tree);
                } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), LOGIC)) {
                    return buildLogicExpression(tree);
                } else {
                    return buildArithmeticExpression(tree);
                }
            }
        } else if (tree.getChildCount() == 1) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.IDENTIFIER)) {
                return buildVariableExpression(tree.getChild(0));
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.NUMBER)) {
                return buildConstantExpression(tree);
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.TRUE)) {
                return buildBooleanExpression(true);
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.FALSE)) {
                return buildBooleanExpression(false);
            } else if (tree.getChild(0).getChildCount() == 2) {
                if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0).getChild(1), CXLexer.IDENTIFIER)) {
                    return buildDefinition(tree.getChild(0));
                }
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0).getChild(0), CXLexer.IDENTIFIER)) {
                return buildVariableExpression(tree.getChild(0).getChild(0));
            }
        } else {


        }
        return null;
    }

    private static IfElseStatement buildIfElse(ParseTree tree) throws Exception {
        Expression condition = buildExpression(tree.getChild(2));
        Statement thenStatement = tree.getChildCount() > 4 ? buildStatement(tree.getChild(4)) : null;
        Statement elseStatement = tree.getChildCount() > 6 ? buildStatement(tree.getChild(6)) : null;
        String endElseLabel = symbolTable.generateLabel("ifelse");
        String endIfLabel = symbolTable.generateLabel("ifelse");
        return new IfElseStatement(condition, thenStatement, elseStatement, endElseLabel, endIfLabel);

    }

    private static ArithmeticExpression buildArithmeticExpression(ParseTree tree) throws Exception {
        Expression leftExpression = buildExpression(tree.getChild(0));
        Expression rightExpression = buildExpression(tree.getChild(2));
        if (TokenJudgement.isToken(tree.getChild(1))) {
            Token token = TokenJudgement.getToken(tree.getChild(1));
            return new ArithmeticExpression(new Int(), leftExpression, rightExpression, token);
        } else {
            return null;
        }
    }

    private static ComparisonExpression buildComparisonExpression(ParseTree tree) throws Exception {
        Expression leftExpression = buildExpression(tree.getChild(0));
        Expression rightExpression = buildExpression(tree.getChild(2));
        Token token = TokenJudgement.getToken(tree.getChild(1));
        return new ComparisonExpression(leftExpression, rightExpression, token);
    }

    private static LogicExpression buildLogicExpression(ParseTree tree) throws Exception {
        Expression leftExpression = buildExpression(tree.getChild(0));
        Expression rightExpression = buildExpression(tree.getChild(2));
        Token token = TokenJudgement.getToken(tree.getChild(1));
        return new LogicExpression(leftExpression, rightExpression, token);

    }


    private static ConstantExpression buildConstantExpression(ParseTree tree) {
        return new ConstantExpression(new Int(), tree);
    }

    private static BooleanExpression buildBooleanExpression(boolean b) {
        return new BooleanExpression(b);
    }

    private static AssignmentExpression buildAssignmentExpression(ParseTree tree) throws Exception {
        String identifier = tree.getChild(0).getText();
        VariableExpression variableExpression = new VariableExpression(symbolTable.getSymbol(identifier));
        Expression expression = buildExpression(tree.getChild(2));
        return new AssignmentExpression(variableExpression, expression);
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
                // int y; y = f(); 由于 y 没有初值，P-machine 不知道这是 int，会爆 instruction str: element you are trying to access is not of type integer.
                VariableExpression variableExpression = new VariableExpression(symbolTable.getSymbol(identifier));
                list.append(variableExpression);
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




}
