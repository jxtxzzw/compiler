package com.jxtxzzw.compiler.ast;

import java.util.ArrayList;

public class CompoundStatement implements Statement {

    private ArrayList<Statement> statements = new ArrayList<>();

    public void append(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        for (Statement statement : statements) {
            code.append(statement.compile());
        }
        return code.toString();
    }
}
