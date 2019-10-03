import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class Program {
    private ArrayList<Statement> statements = new ArrayList<>();
    private StringBuffer code = new StringBuffer();

    public void buildAbstractSyntaxTree(ParseTree tree) {
        for (int i = 0; i < tree.getChildCount(); i++) {
            statements.add(AbstractSyntaxTree.buildStatement(tree.getChild(i)));
        }

    }

    private void generateCode() {
        for (Statement statement : statements) {
            code.append(statement.compile());
        }
    }

    public String outputCode() {
        this.generateCode();
        return code.toString();
    }

}
