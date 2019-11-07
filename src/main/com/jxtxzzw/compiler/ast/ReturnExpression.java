package com.jxtxzzw.compiler.ast;

public class ReturnExpression extends Expression {

    private Expression expression;

    ReturnExpression(Expression expression) {
        super(expression.getBaseType());
        this.expression = expression;
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        code.append(expression.compile());
        code.append("str ").append(expression.getBaseType().getCode()).append(" 0 0\n");
        code.append("retf\n");
//        code.append("retp\n");
        return code.toString();
    }
}
