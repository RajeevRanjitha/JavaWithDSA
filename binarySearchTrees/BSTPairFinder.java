package binarySearchTrees;
import java.util.Stack;
public class BSTPairFinder {
    private BSTclass obj;
    public BSTPairFinder(BSTclass bst) {
        this.obj = bst;
    }
    public static void main(String args[]) 
    {
    	BSTclass bst=new BSTclass();
    	bst.insert(20);
        bst.insert(15);
        bst.insert(30);
        bst.insert(10);
        bst.insert(18);
        bst.insert(25);
        bst.insert(40);
        bst.insert(5);
        bst.insert(12);
        bst.insert(24);
        bst.insert(50);
        BSTPairFinder obj=new BSTPairFinder(bst);
        obj.findPairWithSum(40);
    }
    public void findPairWithSum(int S) {
        if (obj == null) {
            System.out.println("BST is null");
            return;
        }

        BinaryNodeClass<Integer> root = obj.getRoot();
        if (root == null) {
            System.out.println("The tree is empty");
            return;
        }

        Stack<BinaryNodeClass<Integer>> leftStack = new Stack<>();
        Stack<BinaryNodeClass<Integer>> rightStack = new Stack<>();
        BinaryNodeClass<Integer> left = root;
        while (left != null) {
            leftStack.push(left);
            left = left.left;
        }
        BinaryNodeClass<Integer> right = root;
        while (right != null) {
            rightStack.push(right);
            right = right.right;
        }
        boolean pairFound = false;
        while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
            left = leftStack.peek();
            right = rightStack.peek();
            if (left == right) {
                break;
            }
            int sum = left.val + right.val;
            if (sum == S) {
                System.out.println(left.val + " " + right.val);
                pairFound = true;
                BinaryNodeClass<Integer> temp = leftStack.pop();
                temp = temp.right;
                while (temp != null) {
                    leftStack.push(temp);
                    temp = temp.left;
                }
                temp = rightStack.pop();
                temp = temp.left;
                while (temp != null) {
                    rightStack.push(temp);
                    temp = temp.right;
                }
            } else if (sum < S) {
                BinaryNodeClass<Integer> temp = leftStack.pop();
                temp = temp.right;
                while (temp != null) {
                    leftStack.push(temp);
                    temp = temp.left;
                }
            } else {
                BinaryNodeClass<Integer> temp = rightStack.pop();
                temp = temp.left;
                while (temp != null) {
                    rightStack.push(temp);
                    temp = temp.right;
                }
            }
        }
        if (!pairFound) {
            System.out.println("No pair found with sum " + S);
        }
    }

}
