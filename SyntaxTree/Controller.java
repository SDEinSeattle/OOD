package SyntaxTree;

// (4 > (2 + 5)) && (3 == 4)
public class Controller {
    /*
            &&
          /    \
         >      ==
       /   \   /   \
      4     +  3   4
          /  \
         2    5
   */

    public Operand calculate(Node root) {
        // base case
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) { // leaf node, val
            return new Operand(root.getVal());
        }

        // recursion to eval left and right subtree
        Operand left = calculate(root.left);
        Operand right = calculate(root.right);
        return root.calculate(left, right);
    }
}
