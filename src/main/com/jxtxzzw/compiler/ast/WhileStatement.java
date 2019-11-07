package com.jxtxzzw.compiler.ast;

public class WhileStatement implements Statement {

    private Expression condition;
    private Statement statement;
    private String beginLoopLabel;
    private String endLoopLabel;
    private boolean conditionToBreakLoop;

    WhileStatement(Expression condition, boolean conditionToBreakLoop, Statement statement, String beginLoopLabel, String endLoopLabel) {
        this.condition = condition;
        this.conditionToBreakLoop = conditionToBreakLoop;
        this.statement = statement;
        this.beginLoopLabel = beginLoopLabel;
        this.endLoopLabel = endLoopLabel;
    }

    @Override
    public String compile() {
        return beginLoopLabel + ":\n" +
                condition.compile() +
                (conditionToBreakLoop ? "not\n" : "") +
                "fjp " + endLoopLabel + "\n" +
                statement.compile() +
                "ujp " + beginLoopLabel + "\n" +
                endLoopLabel + ":\n";
    }
}
