public class AssignmentExpression extends Expression {

    private Expression expression;
    AssignmentExpression(BaseType baseType, Expression expression) {
        super(baseType);
        this.expression = expression;
    }

    @Override
    public String compile() {
        String code = expression.compile();
        code += "str " + getBaseType().getCode() + " 0 " + "get_var_address_placeholder" + "\n";
        return code;
    }
}
