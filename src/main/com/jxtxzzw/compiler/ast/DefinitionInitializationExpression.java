package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;

public class DefinitionInitializationExpression extends Expression {

    private ArrayList<VariableExpression> variableExpressions = new ArrayList<>();

    DefinitionInitializationExpression(BaseType baseType) {
        super(baseType);
    }

    public void append(VariableExpression variableExpression) {
        this.variableExpressions.add(variableExpression);
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        for (VariableExpression variableExpression: variableExpressions) {
            code.append("ldc ").append(getBaseType().getCode()).append(" ").append(getBaseType().getDefaultValue()).append("\n");
            code.append("str ").append(variableExpression.getBaseType().getCode()).append(" 0 ").append(variableExpression.getSymbol().getAddress()).append("\n");
        }
        return code.toString();
    }
}
