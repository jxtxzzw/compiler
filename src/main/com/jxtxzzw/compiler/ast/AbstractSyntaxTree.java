package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import main.resources.ExpressionTestLexer;

import com.jxtxzzw.compiler.type.BaseType;

public class AbstractSyntaxTree {
    public static Statement buildStatement(ParseTree tree) {
        // TODO: token validation + decide the switch
        return buildExpression(tree);
    }

    private static Expression buildExpression(ParseTree tree) {
        // TODO: token validation + decide the switch
        if (tree.getChildCount() == 3) {
            if (!(tree.getChild(1).getPayload() instanceof Token)); // TODO exception here
            Token token = (Token) tree.getChild(1).getPayload();
            if (token.getType() == ExpressionTestLexer.ASSIGN)
                return buildAssignmentExpression(tree);
            else
                return buildArithmeticExpression(tree);
        } else if (tree.getChildCount() == 1) {
            return buildConstantExpression(tree);
        }
        return null;
    }

    private static ArithmeticExpression buildArithmeticExpression(ParseTree tree) {
        Expression leftExpression = buildExpression(tree.getChild(0));
        Expression rightExpression = buildExpression(tree.getChild(2));
        if (!(tree.getChild(1).getPayload() instanceof Token)); // TODO exception here
        Token token = (Token) tree.getChild(1).getPayload();
        return new ArithmeticExpression(new BaseType("int", "i"), leftExpression, rightExpression, token);
    }

    private static ConstantExpression buildConstantExpression(ParseTree tree) {
        return new ConstantExpression(new BaseType("int", "i"), tree);
    }

    private static AssignmentExpression buildAssignmentExpression(ParseTree tree) {
        Expression expression = buildExpression(tree.getChild(2));
        System.out.println(expression);
        return new AssignmentExpression(new BaseType("int", "i"), expression);
    }
}
