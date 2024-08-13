package trees;

public class PrintingNodesWithoutSiblings {
    public static void main(String args[]) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<Integer>();
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        obj.printlevelWise(root);
        System.out.println();
        printNodesWithoutSiblings(root);
    }
    private static void printNodesWithoutSiblings(BinaryNodeClass<Integer> root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right != null) {
            System.out.println(root.right.val);
        } else if (root.right == null && root.left != null) {
            System.out.println(root.left.val);
        }
        printNodesWithoutSiblings(root.left);
        printNodesWithoutSiblings(root.right);
    }
}