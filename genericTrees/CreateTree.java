package genericTrees;
import java.util.Scanner;
public class CreateTree {
	static Scanner sc=new Scanner(System.in);
	TreeNode<Integer>root;
	public void create() {
        TreeNode<Integer> root = null;
        root = createhelper(root);
    }
    private TreeNode<Integer> createhelper(TreeNode<Integer> root) {
        if (root == null) {
        	System.out.println("Emter the root value");
            root = new TreeNode<>(sc.nextInt());
        }
        System.out.println("Enter the number of childrens you want to enter");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == -1) {
                break;
            }
            TreeNode<Integer> child = new TreeNode<>(x);
            root.children.add(createhelper(child));
        }
        return root;
    }
}
