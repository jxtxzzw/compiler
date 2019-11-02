package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.ast.Expression;
import com.jxtxzzw.compiler.type.Boolean;

public class BooleanExpression extends Expression {

    private boolean b;

    BooleanExpression(boolean b) {
        super(new Boolean());
        this.b = b;
    }

    @Override
    public String compile() {
        return "ldc " + getBaseType().getCode() + " " + (b ? 't' : 'f') + "\n";
    }
}
