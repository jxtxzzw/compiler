package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.Bool;

public class BooleanExpression extends Expression {

    private boolean b;

    BooleanExpression(boolean b) {
        super(new Bool());
        this.b = b;
    }

    @Override
    public String compile() {
        return "ldc " + getBaseType().getCode() + " " + (b ? 't' : 'f') + "\n";
    }
}
