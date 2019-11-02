package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;
import com.jxtxzzw.compiler.type.Boolean;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;

public class LogicExpression extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private Token operator;

    public LogicExpression(Expression leftExpression, Expression rightExpression, Token operator) {
        super(new Boolean());
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }


    @Override
    public String compile() {
        final HashMap<String, String> OPERATORS = new HashMap<>();
        OPERATORS.put("&&", "and");
        OPERATORS.put("||", "or");
        return leftExpression.compile() +
                rightExpression.compile() +
                OPERATORS.get(operator.getText()) + "\n";
    }
}
