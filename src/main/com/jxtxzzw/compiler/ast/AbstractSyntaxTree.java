package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Function;
import com.jxtxzzw.compiler.symboltable.Symbol;
import com.jxtxzzw.compiler.symboltable.SymbolTable;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.jxtxzzw.compiler.type.Int;
import resources.CXLexer;

import java.util.ArrayList;

public class AbstractSyntaxTree {

    private static SymbolTable symbolTable = new SymbolTable();

    public static Statement buildProgeam(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.IDENTIFIER)) {
            return buildFunctionStatement(tree);
        }
        // TODO for/while ...
        throw new Exception();
    }

    // TODO extract this token judgement to a single method
    public static Statement buildStatement(ParseTree tree) throws Exception {
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.SEMICOLON)) {
            return new EmptyStatement();
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.RETURN)) {

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.SEMICOLON)) {
            return buildExpression(tree.getChild(0));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.IF)) {

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.LEFTBRACE)) {

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WHILE)) {

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.FOR)) {

        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.WRITE)) {
            return buildWriteExpression(tree.getChild(1));
        }
        if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.ASSIGN)) {

        }
        throw new Exception();
    }

    private static Expression buildExpression(ParseTree tree) throws Exception {
        // TODO: token validation + decide the switch
        if (tree.getChildCount() == 3) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.ASSIGN)) {
                return buildAssignmentExpression(tree);
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(1), CXLexer.LEFTPARENTHESIS)) {
                return buildFunctionCallExpression(tree);
            } else {
                return buildArithmeticExpression(tree);
            }
        } else if (tree.getChildCount() == 1) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.IDENTIFIER)) {
                return buildVariableExpression(tree.getChild(0));
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0), CXLexer.NUMBER)) {
                return buildConstantExpression(tree);
            } else if (tree.getChild(0).getChildCount() == 2) {
                if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0).getChild(1), CXLexer.IDENTIFIER)) {
                    buildDefinition(tree.getChild(0));
                    return new EmptyExpression(new Int());
                }
            } else if (TokenJudgement.isTokenAndEqualTo(tree.getChild(0).getChild(0), CXLexer.IDENTIFIER)) {
                return buildVariableExpression(tree.getChild(0).getChild(0));
            }
        } else {


        }
        return null;
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

    private static ConstantExpression buildConstantExpression(ParseTree tree) {
        return new ConstantExpression(new Int(), tree);
    }

    private static AssignmentExpression buildAssignmentExpression(ParseTree tree) throws Exception {
        String identifier = tree.getChild(0).getText();
        VariableExpression variableExpression = new VariableExpression(symbolTable.getSymbol(identifier));
        Expression expression = buildExpression(tree.getChild(2));
        return new AssignmentExpression(variableExpression, expression);
    }

    private  static  FunctionCallExpression buildFunctionCallExpression(ParseTree tree) throws Exception {
        // TODO
        return null;
    }

    private static Statement buildFunctionStatement(ParseTree tree) throws Exception {
        String identifier = tree.getChild(1).getText();
        ArrayList<Symbol> parameters = new ArrayList<>();
        symbolTable.registerFunction(identifier, new Int(), parameters); // TODO
        Function function = symbolTable.getFunction(identifier, parameters);
        ArrayList<Statement> statements = new ArrayList<>();
        symbolTable.openFunction(function);
        int index = 0;
        while (!(tree.getChild(index).getPayload() instanceof Token) || ((Token)(tree.getChild(index).getPayload())).getType() != CXLexer.LEFTBRACE) {
            index++;
        }
        index++;
        while (!(tree.getChild(index).getPayload() instanceof Token) || ((Token)(tree.getChild(index).getPayload())).getType() != CXLexer.RIGHTBRACE) {
//            System.out.println(tree.getChild(index).getText());
            statements.add(buildStatement(tree.getChild(index)));
            index++;
        }
        symbolTable.closeFunction(function);
        return new FunctionStatement(function, statements);
        // TODO parameters: new P(identifier, basetype), for now, the list is empty
    }

    public static Statement buildWriteExpression(ParseTree tree) throws Exception {
        return new WriteStatement(buildExpression(tree));
    }

    public static void buildDefinition(ParseTree tree) throws Exception {
        for (int i = 0; i < tree.getChildCount(); i++) {
            if (TokenJudgement.isTokenAndEqualTo(tree.getChild(i), CXLexer.IDENTIFIER)) {
                symbolTable.registerSymbol(tree.getChild(i).getText(), new Int());
            }
        }
    }

    public static VariableExpression buildVariableExpression(ParseTree tree) throws Exception {
        String identifier = tree.getText();
        return new VariableExpression(symbolTable.getSymbol(identifier));
    }



}
