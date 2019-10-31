package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public abstract class Expression implements Statement {

    private BaseType baseType;

    Expression(BaseType baseType) {
        this.baseType = baseType;
    }

    // TODO: if we need directly getBaseTypeName/getBaseTypeCode
    public BaseType getBaseType() {
        return baseType;
    }


}
