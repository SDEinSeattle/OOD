package SyntaxTree;

public class BinaryOperator extends Operator {
    public BinaryOperator(String operator) {
        super(operator);
    }

    @Override
    public Operand calculate(Operand o1, Operand o2) {
        if (!o1.isInteger() || !o2.isInteger()) {
            throw new UnsupportedOperationException("Unsupported Operand Type");
        }
        int val1 = o1.getIntegerRes(), val2 = o2.getIntegerRes();
        if (this.operator.equals(">")) {
            return new Operand(val1 > val2);
        } else if (this.operator.equals("<")) {
            return new Operand(val1 < val2);
        } else if (this.operator.equals("==")) {
            return new Operand(val1 == val2);
        } else if (this.operator.equals("!=")) {
            return new Operand(val1 != val2);
        } else {
            throw new UnsupportedOperationException("Unsupported Operation");
        }
    }
}
