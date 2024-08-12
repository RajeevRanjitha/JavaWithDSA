package trees;

public class CountNumberOfLeafNodes {
	static int count =0;
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println(countLeaf(root));
	}
	private static int countLeaf(BinaryNodeClass<Integer> root) {
		if(root.left==null && root.right==null) 
		{
			count++;
		}
		else 
		{
			countLeaf(root.left);
			countLeaf(root.right);
		}
		return count;
	}
}
