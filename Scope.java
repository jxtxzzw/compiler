public class Scope {
    private int level;


    public Scope(int level) {
        this.level = level;
    }

    public void addSymbol() {

    }

    public void addFunction() {

    }

    public Variable getSymbol() {
        return null;
    }

    public Function getFunction() {
        return null;
    }

    @Override
    public String toString() {
        return "in scope " + level;
    }
}
