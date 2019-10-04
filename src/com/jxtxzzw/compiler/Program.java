package com.jxtxzzw.compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import com.jxtxzzw.compiler.ast.AbstractSyntaxTree;
import com.jxtxzzw.compiler.ast.Statement;

import java.util.ArrayList;

public class Program {
    private ArrayList<Statement> statements = new ArrayList<>();
    private StringBuffer code = new StringBuffer();

    public void buildAbstractSyntaxTree(ParseTree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            statements.add(AbstractSyntaxTree.buildStatement(tree.getChild(i)));
        }
        // TODO: make sure the exception will not cause halt

    }

    private void generateCode() {
        code.append("INITIAL_CODE_PLACEHOLDER\n"); // TODO placeholder
        for (Statement statement : statements) {
            code.append(statement.compile());
        }
        code.append("hlt\n");
    }

    public String outputCode() {
        this.generateCode();
        return code.toString();
    }

}
