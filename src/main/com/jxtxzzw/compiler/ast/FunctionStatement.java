package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.st.Function;

import java.util.ArrayList;

public class FunctionStatement implements Statement {

    private Function function;
    private ArrayList<Statement> statements = new ArrayList<>();

    public FunctionStatement(Function function, ArrayList<Statement> statements) {
        this.function = function;
        this.statements = statements;
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        code.append(function.getLabel()).append(":\n");
        code.append("ssp ").append(function.getParameterSize()).append("\n");
        for (Statement statement: statements) {
            code.append(statement.compile());
        }
        code.append("retp\n");
        return code.toString();
    }
}
