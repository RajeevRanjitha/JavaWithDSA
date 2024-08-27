package genericTrees;

public class CountLeafNodes {
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println(countLeafNodes(obj.root));
	}

	private static int  countLeafNodes(TreeNode<Integer> root) {
		int count =0;
		if(root==null) 
		{
			return count;
		}
		if(root.children.size()==0) 
		{
			return 1;
		}
		for(TreeNode<Integer>child:root.children) 
		{
			count+=countLeafNodes(child);
		}
		return count;
	}
}
