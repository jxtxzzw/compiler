// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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

        for (int i = 0; i < tree.getChildCount(); i++) {
            ParseTree t = tree.getChild(i);
            ExpressionTest et = new ExpressionTest(t);
            String code = et.compile();
            System.out.println(code);
        }

    }
}
