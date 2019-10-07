package com.jxtxzzw.compiler.st;

import com.jxtxzzw.compiler.type.BaseType;

public class Symbol {
    private String identifier;
    private BaseType beseType;
    private int address;

    public Symbol(String identifier, BaseType beseType, int address) {
        this.identifier = identifier;
        this.beseType = beseType;
        this.address = address;
    }

    public String getIdentifier() {
        return identifier;
    }

    public BaseType getBeseType() {
        return beseType;
    }

    public int getAddress() {
        return address;
    }

}
