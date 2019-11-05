package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.Bool;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;

public class ComparisonExpression extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private Token operator;

    public ComparisonExpression(Expression leftExpression, Expression rightExpression, Token operator) {
        super(new Bool());
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public String compile() {
        final HashMap<String, String> OPERATORS = new HashMap<>();
        OPERATORS.put("==", "equ");
        OPERATORS.put("!=", "neq");
        OPERATORS.put(">", "grt");
        OPERATORS.put("<", "les");
        OPERATORS.put(">=", "geq");
        OPERATORS.put("<=", "leq");
        return leftExpression.compile() +
                rightExpression.compile() +
                OPERATORS.get(operator.getText()) + " " + leftExpression.getBaseType().getCode() + "\n";
    }
}
