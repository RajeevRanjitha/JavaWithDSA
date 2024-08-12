package trees;
public class CountNodesInTheBinaryTree {
	static int count=0;
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer> root = obj.Detailedinput(true, null, false);
		obj.printDetailed(root);	
		System.out.println("The total number of Nodes in the Tree is "+countNodes(root));
		System.out.println("The total number of nodes in the tree by using method 2 is "+CountNodesMethod2(root));
	}
	public static int countNodes(BinaryNodeClass<Integer>root) 
	{
		if(root==null) 
		{
			return 0;
		}
		else 
		{
			count++;
		}
		countNodes(root.left);
		countNodes(root.right);
		return count;
	}
	public static int CountNodesMethod2(BinaryNodeClass<Integer>root) 
	{
		if(root==null) 
		{
			return 0;
		}
		int leftCount=CountNodesMethod2(root.left);
		int rightCount=CountNodesMethod2(root.right);
		return 1+leftCount+rightCount;
	}
}
