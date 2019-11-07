package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Symbol;

public class ArrayExpression extends Expression {

    Symbol array;
    Expression index;

    public ArrayExpression(Symbol array, Expression index) {
        super(array.getBeseType());
        this.array = array;
        this.index = index;
    }

    @Override
    public String compile() {
        return "lda 0 " + array.getAddress() + "\n" +
                index.compile() +
                "ixa " + array.getBeseType().getSize() + "\n";
    }
}
