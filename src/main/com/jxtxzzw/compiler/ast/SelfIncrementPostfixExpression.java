package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;
import org.antlr.v4.runtime.Token;
import resources.CXLexer;

public class SelfIncrementPostfixExpression extends Expression {

    private VariableExpression variableExpression;
    private Token token;

    SelfIncrementPostfixExpression(VariableExpression variableExpression, Token token) {
        super(variableExpression.getBaseType());
        this.variableExpression = variableExpression;
        this.token = token;
    }

    @Override
    public String compile() {
        String code = "";
        code += variableExpression.compile();
        code += "dpl i\n";
        code += "ldc i 1\n";
        if (token.getType() == CXLexer.PLUSPLUS)
            code += "add i\n";
        else
            code += "sub i\n";
        code += "str i 0 " + variableExpression.getSymbol().getAddress() + "\n";
        return code;
    }
}
