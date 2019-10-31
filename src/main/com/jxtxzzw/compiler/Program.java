package com.jxtxzzw.compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import com.jxtxzzw.compiler.ast.AbstractSyntaxTree;
import com.jxtxzzw.compiler.ast.Statement;

import java.util.ArrayList;

public class Program {
    private ArrayList<Statement> statements = new ArrayList<>();
    private StringBuffer code = new StringBuffer();

    public void buildAbstractSyntaxTree(ParseTree tree) throws Exception {
        for (int i = 0; i < tree.getChildCount(); i++) {
            statements.add(AbstractSyntaxTree.buildProgeam(tree.getChild(i)));
        }
        // TODO: make sure the exception will not cause halt

    }

    private void generateCode() {
        code.append("mst 0\n").append("cup 0 init\n").append("init:\n").append("ssp 5\n").append("mst 0\n").append("cup 0 main0\n").append("hlt\n");
//        System.out.println(statements.get(0));
        for (Statement statement : statements) {
            code.append(statement.compile());
        }
    }

    public String outputCode() {
        this.generateCode();
        return code.toString();
    }

}
