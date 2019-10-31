package com.jxtxzzw.compiler.type;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseType baseType = (BaseType) o;
        return size == baseType.size &&
                Objects.equals(name, baseType.name) &&
                Objects.equals(code, baseType.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, size);
    }
}
