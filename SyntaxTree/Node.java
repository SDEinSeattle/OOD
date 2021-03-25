package SyntaxTree;

public class Node {
    private Operator operator;
    private Integer val;

    public Node left;
    public Node right;

    public Node(Operator operator) {
        this.operator = operator;
        this.val = null;
    }

    public Node(int val) {
        this.val = val;
        this.operator = null;
    }

    public Integer getVal() {
        return val;
    }

    public boolean isEvaluator() {
        return this.operator != null;
    }

    public Operand calculate(Operand res1, Operand res2) {
        return this.operator.calculate(res1, res2);
    }
}
