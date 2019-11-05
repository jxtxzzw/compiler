package com.jxtxzzw.compiler.ast;

public class MinusExpression extends Expression {

    private Expression expression;

    MinusExpression(Expression expression) {
        super(expression.getBaseType());
        this.expression = expression;
    }

    @Override
    public String compile() {
        return expression.compile() + "neg " + expression.getBaseType().getCode() + "\n";
    }
}
