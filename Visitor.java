import org.antlr.v4.runtime.tree.TerminalNode;

public class Visitor extends ExpressionTestBaseVisitor{
    @Override public String visitNumber(ExpressionTestParser.NumberContext ctx) {
        ctx.NUM().
        System.out.println("ldc i " + ctx.NUM().getText());
        return "";
    }

    @Override public String visitCalc(ExpressionTestParser.CalcContext ctx) {
        visit(ctx.expr(0));
        visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case ExpressionTestParser.ADD:
                System.out.println("add i");
            break;
            case ExpressionTestParser.SUB:
                System.out.println("sub i");
                break;
            case ExpressionTestParser.MUL:
                System.out.println("mul i");
                break;
            case ExpressionTestParser.DIV:
                System.out.println("div i");
                break;
        }
        return "";
    }
}