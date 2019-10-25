package com.jxtxzzw.compiler.type;

public class BaseType {
    private String name;
    private String code;
    private int size;

    public BaseType(String name, String code, int size) {
        this.name = name;
        this.code = code;
        this.size = size;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getSize() { return size; }
}
