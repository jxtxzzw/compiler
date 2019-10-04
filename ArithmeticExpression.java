import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Token;

public class ArithmeticExpression extends Expression {

    private ParseTree tree;

    ArithmeticExpression(BaseType baseType, ParseTree tree) {
        super(baseType);
        this.tree = tree; // TODO: do we really need the whole tree? or can just use built expression
    }

    @Override
    public String compile() {
        String code = "";
        // TODO: use recursively build here, 'cause we can just compile 1+2 but not 1+2+3 now
        code += "ldc i " + tree.getChild(0).getText() + "\n";
        code += "ldc i " + tree.getChild(2).getText() + "\n";
        Token token = (Token) tree.getChild(1).getPayload();
        switch (token.getType()) {
            case ExpressionTestLexer.ADD:
                code += "add i \n";
                break;
            case ExpressionTestLexer.SUB:
                code += "sub i \n";
                break;
            case ExpressionTestLexer.MUL:
                code += "mul i \n";
                break;
            case ExpressionTestLexer.DIV:
                code += "div i \n";
                break;
            default:
                System.out.println(token.getType());
                // TODO: throw exception here
        }
        return code;
    }
}
