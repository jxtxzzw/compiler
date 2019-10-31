package com.jxtxzzw.compiler.ast;

public class EmptyStatement implements Statement {

    @Override
    public String compile() {
        return "";
    }
}
