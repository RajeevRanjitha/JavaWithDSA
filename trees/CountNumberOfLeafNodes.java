package trees;
public class CountNumberOfLeafNodes {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println(countLeaf(root));
	}
	private static int countLeaf(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return 0;
		}
		if(root.left==null && root.right==null) 
		{
			return 1;
		}
		else 
		{
			return countLeaf(root.left)+countLeaf(root.right);
		}
	}
}