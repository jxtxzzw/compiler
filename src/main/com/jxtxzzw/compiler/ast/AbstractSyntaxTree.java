package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.st.Function;
import com.jxtxzzw.compiler.st.Symbol;
import com.jxtxzzw.compiler.st.SymbolTable;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.jxtxzzw.compiler.type.Int;
import resources.CXLexer;

import java.util.ArrayList;

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
            else if (token.getType() == CXLexer.LEFTPARENTHESIS)
                return buildFunctionCallExpression(tree);
            else
                return buildArithmeticExpression(tree);
        } else if (tree.getChildCount() == 1) {
            return buildConstantExpression(tree);
        } else {
            return buildFunctionStatement(tree);
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

    private  static  FunctionCallExpression buildFunctionCallExpression(ParseTree tree) throws Exception {
       // TODO
        return null;
    }

    private static Statement buildFunctionStatement(ParseTree tree) throws Exception {
        String identifier = tree.getChild(1).getText();
        ArrayList<Symbol> parameters = new ArrayList<>();
        Function function = symbolTable.getFunction(identifier, parameters);
        ArrayList<Statement> statements = new ArrayList<>();
        return new FunctionStatement(function, statements);
        // TODO parameters: new P(identifier, basetype), for now, the list is empty
    }




}
