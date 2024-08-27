package genericTrees;

public class ReplaceNodeWithDepth {
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		replace(obj.root,0);
		PrintBetterWay.print(obj.root);
	}

	private static void replace(TreeNode<Integer> root, int k) {
		if(root==null) 
		{
			return ;
		}
		root.val=k;
		for(TreeNode<Integer>child:root.children) 
		{
			replace(child,k+1);
		}
	}
}
