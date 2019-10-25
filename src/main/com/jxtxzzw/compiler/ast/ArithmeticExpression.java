package com.jxtxzzw.compiler.ast;

import org.antlr.v4.runtime.Token;
import resources.ExpressionTestLexer;

import com.jxtxzzw.compiler.type.BaseType;

public class ArithmeticExpression extends Expression {

    private Expression leftExpression;
    private Expression rightExpression;
    private Token token;

    ArithmeticExpression(BaseType baseType, Expression leftExpression, Expression rightExpression, Token token) {
        super(baseType);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.token = token;
    }

    @Override
    public String compile() {
        String code = "";
        code += leftExpression.compile();
        code += rightExpression.compile();
        switch (token.getType()) {
            case ExpressionTestLexer.ADD:
                code += "add i\n";
                break;
            case ExpressionTestLexer.SUB:
                code += "sub i\n";
                break;
            case ExpressionTestLexer.MUL:
                code += "mul i\n";
                break;
            case ExpressionTestLexer.DIV:
                code += "div i\n";
                break;
            default:
                System.out.println(token.getType());
                // TODO: throw exception here
        }
        return code;
    }
}
