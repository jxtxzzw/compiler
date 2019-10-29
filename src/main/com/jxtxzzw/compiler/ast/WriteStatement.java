package com.jxtxzzw.compiler.ast;

public class WriteStatement implements Statement {

    private Expression expression;

    public WriteStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String compile() {
        return expression.compile() + "out " + expression.getBaseType().getCode() + "\n";
    }
}