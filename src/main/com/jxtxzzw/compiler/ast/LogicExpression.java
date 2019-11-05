package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.Bool;
import org.antlr.v4.runtime.Token;
import resources.CXLexer;

import java.util.HashMap;

public class LogicExpression extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private Token operator;

    public LogicExpression(Expression leftExpression, Expression rightExpression, Token operator) {
        super(new Bool());
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    public static String xor(String a, String b) {
        // a xor b ==> (not a and b) or (a and not b) ==> a not b and a b not and or
        String code = "";
        code += a;
        code += "not\n";
        code += b;
        code += "and\n";
        code += a;
        code += b;
        code += "not\n";
        code += "and\n";
        code += "or\n";
        return code;
    }


    @Override
    public String compile() {
        if (operator.getType() == CXLexer.XOR) {
            return xor(leftExpression.compile(), rightExpression.compile());
        } else {
            final HashMap<String, String> OPERATORS = new HashMap<>();
            OPERATORS.put("&&", "and");
            OPERATORS.put("||", "or");
            return leftExpression.compile() +
                    rightExpression.compile() +
                    OPERATORS.get(operator.getText()) + "\n";
        }
    }
}
