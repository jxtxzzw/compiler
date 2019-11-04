package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;
import com.jxtxzzw.compiler.type.Boolean;

public class LogicNotExpression extends Expression {

    private Expression expression;

    LogicNotExpression(Expression expression) {
        super(new Boolean());
        this.expression = expression;
    }

    @Override
    public String compile() {
        return expression.compile() + "not\n";
    }
}
