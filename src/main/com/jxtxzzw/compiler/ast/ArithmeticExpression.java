package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import resources.CXLexer;

import com.jxtxzzw.compiler.type.BaseType;

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

    @Override
    public String compile() {
        String code = "";
        if (token.getType() == CXLexer.MOD) {
            code += leftExpression.compile();
            code += leftExpression.compile();
            code += rightExpression.compile();
            code += "div " + getBaseType().getCode() + "\n";
            code += rightExpression.compile();
            code += "mul " + getBaseType().getCode() + "\n";
            code += "sub " + getBaseType().getCode() + "\n";
        } else {
            code += leftExpression.compile();
            code += rightExpression.compile();
            switch (token.getType()) {
                case CXLexer.PLUS:
                    code += "add "  + getBaseType().getCode() + "\n";
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
//                    throw new Exception();
            }
        }
        return code;
    }
}
