package com.jxtxzzw.compiler.type;


import java.util.HashMap;

public class TypeFactory {

    private static TypeFactory instance;

    public static TypeFactory getInstance() {
        if (instance == null) {
            instance = new TypeFactory();
        }
        return instance;
    }

    private HashMap<String, BaseType> map = new HashMap<>();

    private TypeFactory() {
        map.put("void", new Void());
        map.put("int", new Int());
        map.put("bool", new Bool());
        map.put("real", new Real());
    }


    public BaseType getType(String typeName) {
        return map.get(typeName);
    }

}
