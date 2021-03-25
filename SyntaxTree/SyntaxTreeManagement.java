package SyntaxTree;

public class SyntaxTreeManagement {
        /*
                &&
              /    \
             >      ==
           /   \   /   \
          4     +  3   4
              /   \
             2     5
     */

    public static void main(String[] args) {
        Node root = new Node(new LogicOperator("&&"));
        Node node1 = new Node(new BinaryOperator(">"));
        Node node2 = new Node(new BinaryOperator("=="));
        root.left = node1;
        root.right = node2;
        node2.left = new Node(3);
        node2.right = new Node(4);

        Node node3 = new Node(new IntegerOperator("+"));
        node1.left = new Node(4);
        node1.right = node3;
        node3.left = new Node(2);
        node3.right = new Node(5);

        Controller controller = new Controller();
        System.out.println("Evaluation expresion:");
        System.out.println("4 > (2 + 5) && 3 == 4");
        System.out.println(controller.calculate(root)); // false
    }
}
