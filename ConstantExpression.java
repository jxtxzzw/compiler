import org.antlr.v4.runtime.tree.ParseTree;

public class ConstantExpression extends Expression {
    private ParseTree tree;

    ConstantExpression(BaseType baseType, ParseTree tree) {
        super(baseType);
        this.tree = tree;
    }

    @Override
    public String compile() {
        return "ldc " + getBaseType().getCode() + " " + tree.getChild(0).getText() + "\n";
    }
}
