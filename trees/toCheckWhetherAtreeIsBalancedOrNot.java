package trees;
public class toCheckWhetherAtreeIsBalancedOrNot {
	public static void main(String argsp[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		obj.printlevelWise(root);
		System.out.println();
		System.out.println(checkBalanced(root));
	}
	private static boolean checkBalanced(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return true;
		}
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		if(Math.abs(leftheight-rightheight)>1) 
		{
			return false;
		}
		return checkBalanced(root.left) && checkBalanced(root.right);
	}
	private static int height(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return -1;
		}
		else 
		{
			int leftnodeheight=height(root.left);
			int rightnodeheight=height(root.right);
			return 1+Math.max(leftnodeheight, rightnodeheight);
		}
	}
}
