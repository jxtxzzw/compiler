package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;

public class DefinitionInitializationExpression extends Expression {

    private ArrayList<VariableExpression> variableExpressions = new ArrayList<>();
    private ArrayList<Expression> initialValues = new ArrayList<>();

    DefinitionInitializationExpression(BaseType baseType) {
        super(baseType);
    }

    public void append(VariableExpression variableExpression, Expression initialValue) {
        this.variableExpressions.add(variableExpression);
        this.initialValues.add(initialValue);
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        int size = variableExpressions.size();
        for (int i = 0; i < size; i++) {
            VariableExpression variableExpression = variableExpressions.get(i);
            Expression initialValue = initialValues.get(i);
            if (initialValue != null) {
                code.append(initialValue.compile());
            } else {
                code.append("ldc ").append(getBaseType().getCode()).append(" ").append(getBaseType().getDefaultValue()).append("\n");
            }
            code.append("str ").append(variableExpression.getBaseType().getCode()).append(" 0 ").append(variableExpression.getSymbol().getAddress()).append("\n");
        }
        return code.toString();
    }
}
