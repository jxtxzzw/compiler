package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import resources.CXLexer;

public class ArithmeticExpression extends Expression {

    private Expression leftExpression;
    private Expression rightExpression;
    private Token token;

    ArithmeticExpression(Expression leftExpression, Expression rightExpression, Token token) {
        super(leftExpression.getBaseType());
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.token = token;
    }

    public static String mod(String a, String b) {
        String code = "";
        code += a;
        code += a;
        code += b;
        code += "div i\n";
        code += b;
        code += "mul i\n";
        code += "sub i\n";
        return code;
    }

    @Override
    public String compile() {
        String code = "";
        if (token.getType() == CXLexer.MOD) {
            String a = leftExpression.compile();
            String b = rightExpression.compile();
            code += mod(a, b);
        } else {
            code += leftExpression.compile();
            code += rightExpression.compile();
            switch (token.getType()) {
                case CXLexer.PLUS:
                    code += "add " + getBaseType().getCode() + "\n";
                    break;
                case CXLexer.MINUS:
                    code += "sub " + getBaseType().getCode() + "\n";
                    break;
                case CXLexer.MUL:
                    code += "mul " + getBaseType().getCode() + "\n";
                    break;
                case CXLexer.DIV:
                    code += "div " + getBaseType().getCode() + "\n";
                    break;
                default:
            }
        }
        return code;
    }
}
