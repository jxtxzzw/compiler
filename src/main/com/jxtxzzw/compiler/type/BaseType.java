package com.jxtxzzw.compiler.type;

import com.jxtxzzw.compiler.ast.Expression;
import com.jxtxzzw.compiler.ast.Statement;

import java.util.Objects;

public class BaseType {
    private String name;
    private String code;
    private int size;
    private String defaultValue;

    public BaseType(String name, String code, int size, String defaultValue) {
        this.name = name;
        this.code = code;
        this.size = size;
        this.defaultValue = defaultValue;
    }

    public String getCode() {
        return code;
    }

    public int getSize() { return size; }

    public String getDefaultValue() {
        return defaultValue;
    }

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
