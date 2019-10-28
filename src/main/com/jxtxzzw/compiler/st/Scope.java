package com.jxtxzzw.compiler.st;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private Scope parent;
    private int allocated;
    private HashMap<String, Symbol> symbols = new HashMap<>();
    private ArrayList<Scope> scopes = new ArrayList<>();
    private int functionScopeAddress;
    private ArrayList<Function> functions = new ArrayList<>();

    public Scope(Scope parent, int functionScopeAddress) {
        this.parent = parent;
        this.functionScopeAddress = functionScopeAddress;
    }

    private int level() {
        int level = 0;
        while (parent != null) {
            level++;
            parent = parent.parent;
        }
        return level;
    }

    public Scope openScope(int functionScopeAddress) {
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
        addAllocated(symbol.getBeseType().getSize());
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

    public Function getFunction(String identifier, ArrayList<Symbol> parameters) {
        for (Function function: functions) {
            if (function.getIdentifier().equals(identifier)) {
                if (function.getParameters().size() == parameters.size()) {
                    int size = parameters.size();
                    int i = 0;
                    for (; i < size; i++) {
                        if (!function.getParameters().get(i).getBeseType().equals(parameters.get(i).getBeseType())){
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

    public boolean containsFunction(String identifier, ArrayList<Symbol> parameters) {
        return getFunction(identifier, parameters) != null;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("level: " + level() + "\n");
        for (Symbol symbol : symbols.values()) {
            sb.append(symbol.getIdentifier()).append(":").append(symbol.getBeseType().getName()).append("\n");
        }
        return sb.toString();
    }
}
