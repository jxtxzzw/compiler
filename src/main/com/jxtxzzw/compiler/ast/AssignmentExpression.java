package com.jxtxzzw.compiler.ast;

public class AssignmentExpression extends Expression {

    private Expression expression;
    private VariableExpression variableExpression;
    private ArrayExpression arrayExpression;
    private boolean array;

    AssignmentExpression(VariableExpression variableExpression, Expression expression) {
        super(variableExpression.getBaseType());
        this.variableExpression = variableExpression;
        this.expression = expression;
        array = false;
    }

    AssignmentExpression(ArrayExpression arrayExpression, Expression expression) {
        super(arrayExpression.getBaseType());
        this.arrayExpression = arrayExpression;
        this.expression = expression;
        array = true;
    }

    @Override
    public String compile() {
        if (array) {
            return arrayExpression.compile() +
                    expression.compile() +
                    "sto " + arrayExpression.getBaseType().getCode() + "\n";
        } else {
            return expression.compile() +
                    "str " + variableExpression.getBaseType().getCode() + " 0 " + variableExpression.getSymbol().getAddress() + "\n";
        }


    }
}
