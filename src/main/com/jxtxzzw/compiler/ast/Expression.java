package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public abstract class Expression implements Statement {

    private BaseType baseType;

    Expression(BaseType baseType) {
        this.baseType = baseType;
    }

    public BaseType getBaseType() {
        return baseType;
    }


}
