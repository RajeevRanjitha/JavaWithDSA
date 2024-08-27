package trees;

public class TreeTraversals {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		printInorder(root);
		System.out.println();
		printPreOrder(root);
		System.out.println();
		printPostOrder(root);
	}
	private static void printPostOrder(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return ;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.val);
	}
	private static void printPreOrder(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return ;
		}
		System.out.print(root.val);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	private static void printInorder(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return ;
		}
		printInorder(root.left);
		System.out.print(root.val);
		printInorder(root.right);
	}
}