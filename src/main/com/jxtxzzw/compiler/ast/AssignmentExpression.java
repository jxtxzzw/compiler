package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public class AssignmentExpression extends Expression {

    private Expression expression;
    private VariableExpression variableExpression;
    AssignmentExpression(VariableExpression variableExpression, Expression expression) {
        super(variableExpression.getBaseType());
        this.variableExpression = variableExpression;
        this.expression = expression;
    }

    @Override
    public String compile() {

        return expression.compile() +
                "str " + variableExpression.getBaseType().getCode() + " 0 " + variableExpression.getSymbol().getAddress() + "\n";
    }
}
