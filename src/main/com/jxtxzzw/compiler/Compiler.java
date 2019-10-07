package com.jxtxzzw.compiler;

// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import main.resources.ExpressionTestLexer;
import main.resources.ExpressionTestParser;

import java.io.*;

public class Compiler {
    public static void main(String[] args) throws IOException {
        InputStream cx = new BufferedInputStream(new FileInputStream("test.cx"));
        @SuppressWarnings("deprecation")
        ANTLRInputStream input = new ANTLRInputStream(cx);
        ExpressionTestLexer lexer = new ExpressionTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionTestParser parser = new ExpressionTestParser(tokens);

        ParseTree tree = parser.r();

        Program p = new Program();
        p.buildAbstractSyntaxTree(tree);

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.p")));
        bw.write(p.outputCode());
        bw.close();

    }
}
