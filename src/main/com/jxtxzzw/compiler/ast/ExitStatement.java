package com.jxtxzzw.compiler.ast;

public class ExitStatement implements Statement {
    @Override
    public String compile() {
        return "hlt\n";
    }
}
