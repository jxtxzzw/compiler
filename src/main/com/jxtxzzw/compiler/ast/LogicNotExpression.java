package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.Bool;

public class LogicNotExpression extends Expression {

    private Expression expression;

    LogicNotExpression(Expression expression) {
        super(new Bool());
        this.expression = expression;
    }

    @Override
    public String compile() {
        return expression.compile() + "not\n";
    }
}
