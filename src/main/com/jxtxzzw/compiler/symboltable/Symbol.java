package com.jxtxzzw.compiler.symboltable;

import com.jxtxzzw.compiler.type.BaseType;

public class Symbol {

    private String identifier;
    private BaseType baseType;
    private int address;
    private boolean constant;
    private boolean array;
    private int size; // for array type

    Symbol(String identifier, BaseType baseType, int address, boolean constant, boolean array, int length) {
        this.identifier = identifier;
        this.baseType = baseType;
        int BASE_ADDRESS = 0;
        this.address = address + BASE_ADDRESS;
        this.constant = constant;
        this.array = array;
        if (array) {
            size = length * baseType.getSize();
        } else {
            size = baseType.getSize();
        }
    }

    public String getIdentifier() {
        return identifier;
    }

    public BaseType getBeseType() {
        return baseType;
    }

    public int getAddress() {
        return address;
    }

    public boolean isConstant() {
        return constant;
    }

    public boolean isArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

}
