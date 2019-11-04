package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;
import org.antlr.v4.runtime.Token;

public class SelfIncrementExpression extends Expression {

    private Expression expression;
    private Token token;

    SelfIncrementExpression(Expression expression, Token token) {
        super(expression.getBaseType());
        this.expression = expression;
        this.token = token;
    }

    @Override
    public String compile() {
        return null;
    }
}
