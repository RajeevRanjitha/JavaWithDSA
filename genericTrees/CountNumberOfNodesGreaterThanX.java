package genericTrees;
import java.util.Scanner;
public class CountNumberOfNodesGreaterThanX {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj1=new TakeLevelWiseInput();
		obj1.takeLevelWiseInput();
		System.out.println("Enter the value of K");
		int k=sc.nextInt();
		System.out.println(coutNumberOfNodesGreaterThanX(obj1.root,k));
	}
	private static int coutNumberOfNodesGreaterThanX(TreeNode<Integer> root, Integer x) {
		int count =0;
		if(root==null) 
		{
			return count;
		}
		if(root.val>=x) 
		{
			count =1;
		}
		for(int i=0;i<root.children.size();i++) 
		{
			count += coutNumberOfNodesGreaterThanX(root.children.get(i),x);
		}
		return count;
	}
}
