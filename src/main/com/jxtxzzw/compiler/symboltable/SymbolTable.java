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

//    public void openScope(int functionScopeAddress) {
//        scope = scope.openScope(functionScopeAddress);
//    }
//
//    public void closeScope() {
//        scope = scope.getParent();
//        if (scope == null) {
//            // TODO exception
//        }
//    }

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
        throw new Exception("no symbol: " + identifier);
    }

    public void openFunction(Function function) {
        scope = scope.openScope(Function.PRE_OCCUPIED + function.getParameterSize());
        int currentAddress = Function.PRE_OCCUPIED;
        ArrayList<BaseType> parameterTypes = function.getParameterTypes();
        ArrayList<String> parameters = function.getParameters();
        int size = parameters.size();
        for (int i = 0; i < size; i++) {
            BaseType baseType = parameterTypes.get(i);
            String identifier = parameters.get(i);
            Symbol symbol = new Symbol(identifier, baseType, currentAddress);
            scope.addSymbol(symbol);
            currentAddress += baseType.getSize();
        }
    }

    public void closeFunction(Function function) {
        function.setStaticSize(scope.getTotalAllocated());
        scope = scope.getParent();
    }

    public void registerFunction(String identifier, BaseType returnType, ArrayList<BaseType> parameterTypes, ArrayList<String> parameters) {
        // TODO if contains: exception
        String label = generateLabel(identifier);
        Function function = new Function(identifier, returnType, parameterTypes, parameters, label);
        scope.addFunction(function);
    }

    public Function getFunction(String identifier, ArrayList<BaseType> parameterTypes) throws Exception {
        Scope currentScope = scope;
        while (currentScope != null) {
            if (currentScope.containsFunction(identifier, parameterTypes)) {
                return currentScope.getFunction(identifier, parameterTypes);
            } else {
                currentScope = currentScope.getParent();
            }
        }
        throw new Exception("no function");
    }

    public String generateIfElseLabel() {
        return generateLabel("condition");
    }

    public String generateLoopLabel() {
        return generateLabel("loop");
    }

    private String generateLabel(String name){
        if (labels.containsKey(name)) {
            labels.put(name, labels.get(name) + 1);
        } else {
            labels.put(name, 0);
        }
        return name + labels.get(name);
    }


    @Override
    public String toString() {
        return "SymbolTable{" +
                "scope=" + scope +
                ", labels=" + labels +
                '}';
    }
}
