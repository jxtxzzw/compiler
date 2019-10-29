package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Function;
import com.jxtxzzw.compiler.symboltable.Symbol;

public class FunctionCallExpression extends Expression {

    private Function function;

    FunctionCallExpression(Function function) {
        super(function.getReturnType());

    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        code.append("mst 0\n");
        for (Symbol symbol: function.getParameters()) {
            // TODO
        }
        code.append("cup ").append(function.getParameterSize()).append(" ").append(function.getLabel()).append("\n");
        return code.toString();
    }
}
