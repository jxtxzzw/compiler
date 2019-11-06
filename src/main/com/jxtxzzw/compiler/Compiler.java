package com.jxtxzzw.compiler;

// import ANTLR's runtime libraries

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import resources.CXLexer;
import resources.CXParser;


import java.io.*;

public class Compiler {
    public static void main(String[] args) throws Exception {
        InputStream cx = new BufferedInputStream(new FileInputStream("test.cx"));
        @SuppressWarnings("deprecation")
        ANTLRInputStream input = new ANTLRInputStream(cx);
        CXLexer lexer = new CXLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CXParser parser = new CXParser(tokens);

        ParseTree tree = parser.r();

        Program p = new Program();
        p.buildAbstractSyntaxTree(tree);

        File file = new File("test.p");
        if(!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(p.outputCode());
        bw.close();

    }
}
