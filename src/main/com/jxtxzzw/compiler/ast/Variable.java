package com.jxtxzzw.compiler.ast;

import com.jxtxzzw.compiler.type.BaseType;

public class Variable implements Statement {

    private BaseType baseType;
    private String identifier; // before we can implement the variable, the symbol table should be implemented first
    private int size; // prepare for array
//    private Address address; // is it necessary for address to be a class? or merely a String?

    @Override
    public String compile() {
        return "variable";
    }
}
