package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.st.SymbolTable;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.jxtxzzw.compiler.type.Int;
import resources.CXLexer;

public class AbstractSyntaxTree {

    private static SymbolTable symbolTable = new SymbolTable();

    public static Statement buildStatement(ParseTree tree) throws Exception {
        // TODO: token validation + decide the switch
        return buildExpression(tree.getChild(0).getChild(2).getChild(0).getChild(0));
    }

    private static Expression buildExpression(ParseTree tree) throws Exception {
        // TODO: token validation + decide the switch
        if (tree.getChildCount() == 3) {
            if (!(tree.getChild(1).getPayload() instanceof Token)); // TODO exception here
            Token token = (Token) tree.getChild(1).getPayload();
            if (token.getType() == CXLexer.ASSIGN)
                return buildAssignmentExpression(tree);
            else
                return buildArithmeticExpression(tree);
        } else if (tree.getChildCount() == 1) {
            return buildConstantExpression(tree);
        }
        return null;
    }

    private static ArithmeticExpression buildArithmeticExpression(ParseTree tree) throws Exception {
        Expression leftExpression = buildExpression(tree.getChild(0));
        Expression rightExpression = buildExpression(tree.getChild(2));
        if (!(tree.getChild(1).getPayload() instanceof Token)); // TODO exception here
        Token token = (Token) tree.getChild(1).getPayload();
        return new ArithmeticExpression(new Int(), leftExpression, rightExpression, token);
    }

    private static ConstantExpression buildConstantExpression(ParseTree tree) {
        return new ConstantExpression(new Int(), tree);
    }

    private static AssignmentExpression buildAssignmentExpression(ParseTree tree) throws Exception {
        // TODO should be done in declaration
        symbolTable.registerSymbol("x", new Int());
        symbolTable.registerSymbol("y", new Int());
        // TODO check type
        String identifier = tree.getChild(0).getText();
        VariableExpression variableExpression = new VariableExpression(symbolTable.getSymbol(identifier));
        Expression expression = buildExpression(tree.getChild(2));
        return new AssignmentExpression(variableExpression, expression);
    }
}
