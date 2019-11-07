package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;

public class CompoundExpression extends Expression {

    private ArrayList<Expression> expressions = new ArrayList<>();

    CompoundExpression(BaseType baseType) {
        super(baseType);
    }

    public void append(Expression expression) {
        expressions.add(expression);
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        for (Expression expression : expressions) {
            code.append(expression.compile());
        }
        return code.toString();
    }
}
