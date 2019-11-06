package com.jxtxzzw.compiler.ast;

public class ReadStatement implements Statement {

    private VariableExpression variableExpression;
    public ReadStatement(VariableExpression variableExpression) {
        this.variableExpression = variableExpression;
    }

    @Override
    public String compile() {
        return
                "in " + variableExpression.getBaseType().getCode() + "\n" +
                "str " + variableExpression.getBaseType().getCode() + " 0 " + variableExpression.getSymbol().getAddress() + "\n";
    }
}
