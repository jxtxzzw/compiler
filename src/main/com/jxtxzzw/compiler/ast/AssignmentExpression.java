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

        StringBuilder code = new StringBuilder();
//        code.append("==BEGIN==\n");
        code.append(expression.compile());
//        code.append("==END==\n");
        code.append("str ").append(variableExpression.getBaseType().getCode()).append(" 0 ").append(variableExpression.getSymbol().getAddress()).append("\n");
        return code.toString();
    }
}
