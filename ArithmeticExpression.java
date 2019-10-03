import org.antlr.v4.runtime.tree.ParseTree;

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
        // TODO: better change the String compare to token == in lexer
        ParseTree token = (ParseTree) tree.getChild(1).getPayload();
        switch (token.getText()) {
            case "+":
                code += "add i \n";
                break;
            case "-":
                code += "sub i \n";
                break;
            case "*":
                code += "mul i \n";
                break;
            case "/":
                code += "div i \n";
                break;
            // TODO: default branch
        }
        return code;
    }
}
