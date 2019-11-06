package com.jxtxzzw.compiler.symboltable;

import com.jxtxzzw.compiler.type.BaseType;

public class Symbol {
    private final int BASE_ADDRESS = 0;

    private String identifier;
    private BaseType beseType;
    private int address;
    boolean constant;

    public Symbol(String identifier, BaseType beseType, int address, boolean constant) {
        this.identifier = identifier;
        this.beseType = beseType;
        this.address = address + BASE_ADDRESS;
        this.constant = constant;
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

    public boolean isConstant() {
        return constant;
    }

}
