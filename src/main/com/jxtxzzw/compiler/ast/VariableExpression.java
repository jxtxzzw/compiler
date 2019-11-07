package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Symbol;

public class VariableExpression extends Expression {
    private Symbol symbol;
    private ArrayExpression arrayExpression;
    private boolean array;

    VariableExpression(Symbol symbol) {
        super(symbol.getBeseType());
        this.symbol = symbol;
        array = false;
    }
    VariableExpression(ArrayExpression arrayExpression) {
        super(arrayExpression.getBaseType());
        this.arrayExpression = arrayExpression;
        array = true;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    @Override
    public String compile() {
        if (array) {
            return arrayExpression.compile() +
                    "ind " + arrayExpression.getBaseType().getCode() + "\n";
        } else {
            return "lod " + symbol.getBeseType().getCode() + " 0 " + symbol.getAddress() + "\n";
        }
    }
}
