package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.symboltable.Symbol;

public class Variable implements Statement {

    private Symbol symbol;


    @Override
    public String compile() {
        String code = "lod " + symbol.getBeseType().getCode() + " 0 " + symbol.getAddress() + "\n";
        return code;
    }
}
