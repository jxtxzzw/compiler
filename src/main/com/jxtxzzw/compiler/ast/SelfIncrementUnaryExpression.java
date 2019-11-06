package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import resources.CXLexer;

public class SelfIncrementUnaryExpression extends Expression {

    private Token token;
    private VariableExpression variableExpression;

    SelfIncrementUnaryExpression(Token token, VariableExpression variableExpression) {
        super(variableExpression.getBaseType());
        this.variableExpression = variableExpression;
        this.token = token;
    }

    @Override
    public String compile() {
        String code = "";
        code += variableExpression.compile();
        code += "ldc i 1\n";
        if (token.getType() == CXLexer.PLUSPLUS)
            code += "add i\n";
        else
            code += "sub i\n";
        code += "dpl i\n";
        code += "str i 0 " + variableExpression.getSymbol().getAddress() + "\n";
        return code;
    }
}
