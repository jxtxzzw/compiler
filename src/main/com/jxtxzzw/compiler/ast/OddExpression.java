package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.TypeFactory;

public class OddExpression extends Expression {

    private Expression expression;

    OddExpression(Expression expression) {
        super(TypeFactory.getInstance().getType("bool"));
        this.expression = expression;
    }

    @Override
    public String compile() {
        String code = "";
        String a = expression.compile();
        String b = "ldc i 2\n";
        code += ArithmeticExpression.mod(a, b);
        code += "ldc i 1\n";
        code += "equ i\n";
        return code;
    }
}
