package trees;
public class CheckBalancedImproved {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println(checkBalanced(root).isbal);
	}
	private static BalancedTreeReturn checkBalanced(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			BalancedTreeReturn obj=new BalancedTreeReturn();
			obj.height=0;
			obj.isbal=true;
			return obj;
		}
		BalancedTreeReturn leftOutput=checkBalanced(root.left);
		BalancedTreeReturn rightOutput=checkBalanced(root.right);
		int height=1+Math.max(leftOutput.height,rightOutput.height);
		boolean isBal=true;
		if(Math.abs(leftOutput.height-rightOutput.height)>1) 
		{
			isBal=false;
		}
		if(!(leftOutput.isbal && rightOutput.isbal)) 
		{
			isBal=false;
		}
		BalancedTreeReturn obj=new BalancedTreeReturn();
		obj.height=height;
		obj.isbal=isBal;
		return obj;
	}
}
