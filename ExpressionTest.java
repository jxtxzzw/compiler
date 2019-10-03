//import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.tree.*;
//
//public class ExpressionTest implements Statement {
//
//    private ParseTree tree;
//
//    ExpressionTest(ParseTree tree) {
//        this.tree = tree;
//    }
//    @Override
//    public String compile() {
//        String code = "";
//        // TODO: leftExpression = recursively build leftExpression, same for rightExpression
//        Object leftExpression = tree.getChild(0).getPayload();
//        ParseTree token = null;
//        if (tree.getChild(1).getPayload() instanceof Token){
//        } else {
//            // TODO: exception
//            token = (ParseTree) tree.getChild(1).getPayload();
//        }
//        Object rightExpression = tree.getChild(2).getPayload();
//        // TODO: check leftExpression.baseType equals rightExpression.baseType
//        code += "ldc i " + tree.getChild(0).getText() + "\n";
//        code += "ldc i " + tree.getChild(2).getText() + "\n";
//        // TODO: change it to Token type
//        assert token != null;
//        switch (token.getText()) {
//            case "+":
//                code += "add i \n";
//                break;
//            case "-":
//                code += "sub i \n";
//                break;
//            case "*":
//                code += "mul i \n";
//                break;
//            case "/":
//                code += "div i \n";
//                break;
//            // TODO: default branch
//        }
//        return code;
//    }
//}
