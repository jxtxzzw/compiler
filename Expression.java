
abstract class Expression implements Statement {

    private BaseType baseType;

    Expression(BaseType baseType) {
        this.baseType = baseType;
    }

    // TODO: if we need directly getBaseTypeName/getBaseTypeCode
    public BaseType getBaseType() {
        return baseType;
    }
}
