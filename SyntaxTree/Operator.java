package SyntaxTree;

public abstract class Operator {
    String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    public abstract Operand calculate(Operand val1, Operand val2);
}
