package com.jxtxzzw.compiler.symboltable;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;

public class Function {


    static final int PRE_OCCUPIED = 5;
    private String identifier;
    private BaseType returnType;
    private ArrayList<BaseType> parameterTypes;
    private ArrayList<String> parameters;
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

    Function(String identifier, BaseType returnType, ArrayList<BaseType> parameterTypes, ArrayList<String> parameters, String label) {
        this.identifier = identifier;
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
        this.parameters = parameters;
        this.label = label;
    }

    ArrayList<BaseType> getParameterTypes() {
        return parameterTypes;
    }

    ArrayList<String> getParameters() {
        return parameters;
    }

    void setStaticSize(int staticSize) {
        this.staticSize = staticSize;
    }

    public int getSize() {
        return PRE_OCCUPIED + staticSize + getParameterSize();
    }

    public int getParameterSize() {
        int size = 0;
        for (BaseType baseType : parameterTypes) {
            size += baseType.getSize();
        }
        return size;
    }

}
