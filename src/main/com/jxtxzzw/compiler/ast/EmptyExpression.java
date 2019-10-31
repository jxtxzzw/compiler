package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public class EmptyExpression extends Expression {
    EmptyExpression(BaseType baseType) {
        super(baseType);
    }

    @Override
    public String compile() {
        return "";
    }
}
