package com.jxtxzzw.compiler;// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import resources.ExpressionTestLexer;
import resources.ExpressionTestParser;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream cx = System.in;
        @SuppressWarnings("deprecation")
        ANTLRInputStream input = new ANTLRInputStream(cx);
        ExpressionTestLexer lexer = new ExpressionTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionTestParser parser = new ExpressionTestParser(tokens);

        ParseTree tree = parser.r();

        Program p = new Program();
        p.buildAbstractSyntaxTree(tree);
        System.out.println(p.outputCode());

    }
}
