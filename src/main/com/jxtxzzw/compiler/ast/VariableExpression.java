package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public class VariableExpression extends Expression {
    VariableExpression(BaseType baseType) {
        super(baseType);
    }

    @Override
    public String compile() {
        return null;
    }
}
