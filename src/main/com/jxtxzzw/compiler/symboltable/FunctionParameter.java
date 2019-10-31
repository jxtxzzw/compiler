package com.jxtxzzw.compiler.symboltable;

import com.jxtxzzw.compiler.ast.Expression;

public class FunctionParameter {
    private Expression expression;

    public FunctionParameter(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
