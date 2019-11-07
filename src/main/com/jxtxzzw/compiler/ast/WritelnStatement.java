package com.jxtxzzw.compiler.ast;

public class WritelnStatement extends WriteStatement {

    WritelnStatement(Expression expression) {
        super(expression);
    }

    @Override
    public String compile() {
        return super.compile() + "ldc c '\\n'\nout c\n";
    }
}