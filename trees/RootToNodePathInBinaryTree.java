package trees;

import java.util.ArrayList;
import java.util.Scanner;
public class RootToNodePathInBinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>();
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        System.out.println("Enter the value you want to Search for path");
        int x = sc.nextInt();
        ArrayList<Integer> path = rootToNodePath(root, x);
        if (path.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found and the Path is ");
            for (int i : path) {
                System.out.print(i + " ");
            }
        }
    }
    private static ArrayList<Integer> rootToNodePath(BinaryNodeClass<Integer> root, int k) {
        if (root == null) {
            return new ArrayList<>();
        }   
        if (root.val == k) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(root.val);
            return path;
        }
        ArrayList<Integer> leftPath = rootToNodePath(root.left, k);
        if (!leftPath.isEmpty()) {
            leftPath.add(root.val);
            return leftPath;
        }
        ArrayList<Integer> rightPath = rootToNodePath(root.right, k);
        if (!rightPath.isEmpty()) {
            rightPath.add(root.val);
            return rightPath;
        }
        return new ArrayList<>();
    }
}
