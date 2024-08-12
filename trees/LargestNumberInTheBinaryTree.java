package trees;
public class LargestNumberInTheBinaryTree {
    public static void main(String args[]) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<Integer>();
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        System.out.println("The largest number in the binary tree is: " + largeNumber(root, Integer.MIN_VALUE));
    }
    private static int largeNumber(BinaryNodeClass<Integer> root, int large) {
        if (root == null) {
            return large;
        }
        if (root.val > large) {
            large = root.val;
        }
        int leftLarge = largeNumber(root.left, large);
        int rightLarge = largeNumber(root.right, large);
        return Math.max(large, Math.max(leftLarge, rightLarge));
    }
}
