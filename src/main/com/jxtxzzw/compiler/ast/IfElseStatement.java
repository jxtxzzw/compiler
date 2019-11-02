package com.jxtxzzw.compiler.ast;

public class IfElseStatement implements Statement {

    private Expression condition;
    private Statement thenStatement;
    private Statement elseStatement;
    private String endElseLabel;
    private String endIfLabel;

    public IfElseStatement(Expression condition, Statement thenStatement, Statement elseStatement, String endElseLabel, String endIfLabel) {
        this.condition = condition;
        this.thenStatement = thenStatement;
        this.elseStatement = elseStatement;
        this.endElseLabel = endElseLabel;
        this.endIfLabel = endIfLabel;
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        code.append(condition.compile());
        code.append("fjp ").append(endIfLabel).append("\n");
        if (thenStatement != null) {
            code.append(thenStatement.compile());
        }
        if (elseStatement != null) {
            code.append("ujp ").append(endElseLabel).append("\n");
        }
        code.append(endIfLabel).append(":\n");
        if (elseStatement != null) {
            code.append(elseStatement.compile());
            code.append(endElseLabel).append(":\n");
        }
        return code.toString();
    }
}
