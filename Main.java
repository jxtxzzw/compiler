// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream instream = System.in;
        @SuppressWarnings("deprecation")
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExpressionTestLexer lexer = new ExpressionTestLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionTestParser parser = new ExpressionTestParser(tokens);

        ParseTree tree = parser.r();
        System.out.println(tree.toStringTree(parser));

        Visitor v = new Visitor();;
        v.visit(tree);
        System.out.println("hlt");
    }
}