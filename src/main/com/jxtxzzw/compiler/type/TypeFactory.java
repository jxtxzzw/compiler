package com.jxtxzzw.compiler.type;


import java.util.HashMap;

public class TypeFactory {
    private HashMap<String, BaseType> map = new HashMap<>();

    public TypeFactory() {
        map.put("void", new Void());
        map.put("int", new Int());
        map.put("bool", new Bool());
    }

    public BaseType getType(String typeName) {
        return map.get(typeName);
    }

}
