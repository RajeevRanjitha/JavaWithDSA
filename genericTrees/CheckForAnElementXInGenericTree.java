package genericTrees;
import java.util.Scanner;
public class CheckForAnElementXInGenericTree {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println("Enter the element you want to Search");
		int x=sc.nextInt();
		System.out.println(find(obj.root,x));
	}
	public static boolean find(TreeNode<Integer>root,int x) 
	{
		boolean val=false;
		if(root==null) 
		{
			return val;
		}
		if(root.val==x) 
		{
			val=true;
			return val;
		}
		for(TreeNode<Integer>child: root.children) 
		{
			val=find(child,x)|| val;
		}
		return val;
	}
}
