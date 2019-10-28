package com.jxtxzzw.compiler.st;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;

public class Function {


    public static final int PRE_OCCUPIED = 5;
    private String identifier;
    private BaseType returnType;
    private ArrayList<Symbol> parameters = new ArrayList<>();
    private String label;
    private int staticSize;

    public String getIdentifier() {
        return identifier;
    }

    public BaseType getReturnType() {
        return returnType;
    }

    public String getLabel() {
        return label;
    }

    public Function(String identifier, BaseType returnType, ArrayList<Symbol> parameters, String label) {
        this.identifier = identifier;
        this.returnType = returnType;
        this.parameters = parameters;
        this.label = label;
    }

    public void setStaticSize(int staticSize) {
        this.staticSize = staticSize;
    }

    public void setParameters(ArrayList<Symbol> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<Symbol> getParameters() {
        return parameters;
    }

    public int getSize() {
        return PRE_OCCUPIED + staticSize + getParameterSize();
    }

    public int getParameterSize() {
        int size = 0;
        for (Symbol symbol: parameters) {
            size += symbol.getBeseType().getSize();
        }
        return size;
    }

}
