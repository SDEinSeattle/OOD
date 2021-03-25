package SyntaxTree;

public class LogicOperator extends Operator{
    public LogicOperator(String operator) {
        super(operator);
    }

    @Override
    public Operand calculate(Operand o1, Operand o2) {
        if (!o1.isBoolean() || !o2.isBoolean()) {
            throw new UnsupportedOperationException("Unsupported Operand Type");
        }
        boolean val1 = o1.getBooleanRes(), val2 = o2.getBooleanRes();
        if (this.operator.equals("&&")) {
            return new Operand(val1 && val2);
        } else if (this.operator.equals("||")) {
            return new Operand(val1 || val2);
        } else {
            throw new UnsupportedOperationException("Unsupported Operation");
        }
    }
}
