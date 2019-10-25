package com.jxtxzzw.compiler.st;

import com.jxtxzzw.compiler.type.BaseType;

public class Symbol {
    private final int BASE_ADDRESS = 3;

    private String identifier;
    private BaseType beseType;
    private int address;

    public Symbol(String identifier, BaseType beseType, int address) {
        this.identifier = identifier;
        this.beseType = beseType;
        this.address = address + BASE_ADDRESS;
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
