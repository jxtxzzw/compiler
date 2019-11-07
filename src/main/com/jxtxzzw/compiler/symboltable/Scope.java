package com.jxtxzzw.compiler.symboltable;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private Scope parent;
    private int allocated;
    private HashMap<String, Symbol> symbols = new HashMap<>();
    private ArrayList<Scope> scopes = new ArrayList<>();
    private int functionScopeAddress;
    private ArrayList<Function> functions = new ArrayList<>();

    Scope(Scope parent, int functionScopeAddress) {
        this.parent = parent;
        this.functionScopeAddress = functionScopeAddress;
    }

//    private int level() {
//        int level = 0;
//        Scope current = this;
//        while (current.parent != null) {
//            level++;
//            current = current.parent;
//        }
//        return level;
//    }

    Scope openScope(int functionScopeAddress) {
        Scope scope = new Scope(this, functionScopeAddress);
        scopes.add(scope);
        return scope;
    }

    public Scope getParent() {
        return parent;
    }

    public int getAllocated() {
        return allocated + functionScopeAddress;
    }

    private void addAllocated(int size) {
        allocated += size;
    }

    public int getTotalAllocated () {
        int totalAllocated = allocated;
        for (Scope scope : scopes) {
            totalAllocated += scope.getTotalAllocated();
        }
        return  totalAllocated;
    }

    public void addSymbol(Symbol symbol) {
        symbols.put(symbol.getIdentifier(), symbol);
        if (symbol.isArray()) {
            addAllocated(symbol.getSize());
        } else {
            addAllocated(symbol.getBeseType().getSize());
        }
    }

    public Symbol getSymbol(String identifier) {
        return symbols.get(identifier);
    }

    public boolean containsSymbol(String identifier) {
        return symbols.containsKey(identifier);
    }

    public void addFunction(Function function) {
        functions.add(function);
    }

    public Function getFunction(String identifier, ArrayList<BaseType> parameterTypes) {
        for (Function function: functions) {
            if (function.getIdentifier().equals(identifier)) {
                if (function.getParameterTypes().size() == parameterTypes.size()) {
                    int size = parameterTypes.size();
                    int i = 0;
                    for (; i < size; i++) {
                        if (!function.getParameterTypes().get(i).equals(parameterTypes.get(i))){
                            break;
                        }
                    }
                    if (i == size) {
                        return function;
                    }
                }
            }
        }
        return null;
    }

    public boolean containsFunction(String identifier, ArrayList<BaseType> parameterTypes) {
        return getFunction(identifier, parameterTypes) != null;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < level(); i++) {
//            sb.append(" ");
//        }
        sb.append(functions);
        sb.append("\n");
        return sb.toString();
    }
}
