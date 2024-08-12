package trees;
public class SumOfNodesOfTheTree {
	static int count =0;
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println(sumofNodes(root));
	}
	public static int sumofNodes(BinaryNodeClass<Integer>root) 
	{
		if(root==null) 
		{
			return 0;
		}
		count+=root.val;
		sumofNodes(root.left);
		sumofNodes(root.right);
		return count;
	}
}
