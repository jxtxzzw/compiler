package com.jxtxzzw.compiler.st;

import com.jxtxzzw.compiler.type.BaseType;

public class SymbolTable {
    private Scope scope;

    public SymbolTable() {
        scope = new Scope(null);
    }

    public void openScope() {
        scope = scope.openScope();
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

}
