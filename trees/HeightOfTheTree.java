package trees;
import java.util.Scanner;
public class HeightOfTheTree {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println(height(root));
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