package trees;
public class MirrorBinaryTree {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<>() ;
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println("Before Modifying the Treee");
		obj.printlevelWise(root);
		System.out.println();
		root=mirrorBinaryTreee(root);
		System.out.println("After Modifying the Tree");
		obj.printlevelWise(root);
	}
	private static BinaryNodeClass<Integer> mirrorBinaryTreee(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return null;
		}
		BinaryNodeClass<Integer>temp=root.left;
		root.left=root.right;
		root.right=temp;
		 mirrorBinaryTreee(root.left);
		 mirrorBinaryTreee(root.right);
		 return root;
	}
}