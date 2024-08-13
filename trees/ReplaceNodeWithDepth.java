package trees;
public class ReplaceNodeWithDepth {
	public static void main(String args[])
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		int k=0;
		replaceNodeWithDepth(root,k);
		obj.printlevelWise(root);
	}
	private static void replaceNodeWithDepth(BinaryNodeClass<Integer> root,int k) 
	{
		if(root==null) 
		{
			return;
		}
		root.val=k;
		replaceNodeWithDepth(root.left,k+1);
		replaceNodeWithDepth(root.right,k+1);
	}
}