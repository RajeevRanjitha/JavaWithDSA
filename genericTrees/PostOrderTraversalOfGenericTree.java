package genericTrees;
public class PostOrderTraversalOfGenericTree {
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		postOrderPrint(obj.root);
	}
	private static void postOrderPrint(TreeNode<Integer> root) {
		if(root==null) 
		{
			return;
		}
		for(int i=0;i<root.children.size();i++) 
		{
			postOrderPrint(root.children.get(i));
		}
		System.out.println(root.val);
	}
}
