package com.jxtxzzw.compiler.symboltable;

import com.jxtxzzw.compiler.type.BaseType;

import java.util.ArrayList;
import java.util.HashMap;

public class SymbolTable {
    private Scope scope;
    private HashMap<String, Integer> labels = new HashMap<>();

    public SymbolTable() {
        scope = new Scope(null, 0);
    }

    public void openScope(int functionScopeAddress) {
        scope = scope.openScope(functionScopeAddress);
    }

    public void closeScope() {
        scope = scope.getParent();
        if (scope == null) {
            // TODO exception
        }
    }

    public void registerSymbol(String identifier, BaseType baseType){
        if (scope.containsSymbol(identifier)) {
            // TODO exception
        }
        int address = scope.getAllocated();
        Symbol symbol = new Symbol(identifier, baseType, address);
        scope.addSymbol(symbol);
    }

    public Symbol getSymbol(String identifier) throws Exception {
        Scope currentScope = scope;
        while (currentScope != null) {
            if (currentScope.containsSymbol(identifier)) {
                return currentScope.getSymbol(identifier);
            } else {
                currentScope = currentScope.getParent();
            }
        }
        throw new Exception("no symbol");
    }

    public void openFunction(Function function) {
        scope = scope.openScope(Function.PRE_OCCUPIED + function.getParameterSize());
        int currentAddress = Function.PRE_OCCUPIED;
        for (Symbol symbol: function.getParameters()) {
            scope.addSymbol(new Symbol(symbol.getIdentifier(), symbol.getBeseType(), currentAddress));
            currentAddress += symbol.getBeseType().getSize();
        }
    }

    public void closeFunction(Function function) {
        function.setStaticSize(scope.getTotalAllocated());
        scope = scope.getParent();
    }

    public void registerFunction(String identifier, BaseType returnType, ArrayList<Symbol> parameters) {
        // TODO if contains: exception
        String label = generateLabel(identifier);
        Function function = new Function(identifier, returnType, parameters, label);
        scope.addFunction(function);
    }

    public Function getFunction(String identifier, ArrayList<Symbol> parameters) throws Exception {
        Scope currentScope = scope;
        while (currentScope != null) {
            if (currentScope.containsFunction(identifier, parameters)) {
                return currentScope.getFunction(identifier, parameters);
            } else {
                currentScope = currentScope.getParent();
            }
        }
        throw new Exception("no function");
    }

    private String generateLabel(String name){
        if (labels.containsKey(name)) {
            labels.put(name, labels.get(name) + 1);
        } else {
            labels.put(name, 0);
        }
        return name + labels.get(name);
    }






}
