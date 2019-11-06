package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public class CastExpression extends Expression {

    private Expression expression;

    CastExpression(BaseType newBaseType, Expression expression) {
        super(newBaseType);
        this.expression = expression;
    }

    @Override
    public String compile() {
        return expression.compile() +
                "conv " + expression.getBaseType().getCode() + " " + getBaseType().getCode() + "\n";
    }
}
