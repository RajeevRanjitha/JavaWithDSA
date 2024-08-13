package trees;
public class RemoveLeafNodes {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<>() ;
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println("Before removing the leaf Nodes");
		obj.printlevelWise(root);
		System.out.println();
		root=removeLeafNodes(root);
		System.out.println("After removing the Leaf Nodes");
		obj.printlevelWise(root);
	}

	private static BinaryNodeClass<Integer> removeLeafNodes(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return null;
		}
		if(root.left==null && root.right==null) 
		{
			return null;
		}
		root.left=removeLeafNodes(root.left);
		root.right=removeLeafNodes(root.right);
		return root;
	}
}
