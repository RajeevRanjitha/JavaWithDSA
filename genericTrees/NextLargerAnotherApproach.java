package genericTrees;
import java.util.Scanner;

public class NextLargerAnotherApproach {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		int result=nextLarger(obj.root,k);
        if (result == Integer.MAX_VALUE) {
            System.out.println("No larger value found.");
        } else {
            System.out.println(result);
        }
	}
	private static int nextLarger(TreeNode<Integer> root, int k) {
		if(root==null) 
		{
			return -1;
		}
		int nextLarge=Integer.MAX_VALUE;
		if(root.val>k) 
		{
			nextLarge=k;
		}
		for(TreeNode<Integer>child: root.children) 
		{
			int childLarge=nextLarger(child,k);
			if(childLarge>k  && childLarge<nextLarge) 
			{
				nextLarge=k;
			}
		}
		return nextLarge;
	}
}
