package binarySearchTrees;
import java.util.Scanner;
import java.util.ArrayList;
public class RootToPathInBST {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>();
        BinaryNodeClass<Integer> root = obj.createBinary();
        System.out.println("Enter the Element you want to Search");
        int n = sc.nextInt();
        ArrayList<Integer> path = rootToPath(root, n);
        if (path.isEmpty()) {
            System.out.println(n + " is not found in the BST.");
        } else {
            System.out.println("Path to " + n + ":");
            for (int i : path) {
                System.out.print(i + " ");
            }
        }
    }
	private static ArrayList<Integer> rootToPath(BinaryNodeClass<Integer> root, int n) {
		if(root==null) 
		{
			return new ArrayList<Integer>();
		}
		if(n==root.val) 
		{
			ArrayList<Integer>path =new ArrayList<Integer>();
			path.add(root.val);
			return path;
		}
		if(n>root.val) 
		{
			ArrayList<Integer>right=rootToPath(root.right,n);
			if(!right.isEmpty()) 
			{
				right.add(root.val);
				return right;
			}
		}
		if(n<root.val) 
		{
			ArrayList<Integer>left=rootToPath(root.left,n);
			if(!left.isEmpty()) 
			{
				left.add(root.val);
				return left;
			}
		}
		return new ArrayList<Integer>();
	}
    
}