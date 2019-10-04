package com.jxtxzzw.compiler.st;

public class Symbol {
    private Scope scope;



    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("==========");
        sb.append("Symbol Table");
        sb.append("in global scope:" + scope.toString());
        sb.append("==========");
        return sb.toString();
    }
}
