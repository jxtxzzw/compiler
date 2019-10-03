import org.antlr.v4.runtime.tree.ParseTree;

public class AbstractSyntaxTree {
    public static Statement buildStatement(ParseTree tree) {
        // TODO: token validation + decide the switch
        return buildExpression(tree);
    }

    private static Expression buildExpression(ParseTree tree) {
        // TODO: token validation + decide the switch
        return buildArithmeticExpression(tree);
    }

    private static ArithmeticExpression buildArithmeticExpression(ParseTree tree) {
        return new ArithmeticExpression(new BaseType("int", "i"), tree);
    }
}
