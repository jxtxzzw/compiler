package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Function;
import com.jxtxzzw.compiler.symboltable.FunctionParameter;
import com.jxtxzzw.compiler.symboltable.Symbol;

import java.util.ArrayList;

public class FunctionCallExpression extends Expression {

    private Function function;
    private ArrayList<Expression> parameters;

    FunctionCallExpression(Function function, ArrayList<Expression> parameters) {
        super(function.getReturnType());
        this.function = function;
        this.parameters = parameters;
    }

    @Override
    public String compile() {
        StringBuilder code = new StringBuilder();
        code.append("mst 0\n");
        for (Expression expression: parameters) {
            code.append(expression.compile());
        }
        code.append("cup ").append(function.getParameterSize()).append(" ").append(function.getLabel()).append("\n");
        return code.toString();
    }
}
