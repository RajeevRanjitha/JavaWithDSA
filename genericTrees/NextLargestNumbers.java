package genericTrees;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class NextLargestNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println("Enter the vaue of k");
		int k=sc.nextInt();
		System.out.println(nextLarger(obj.root,k));
	}
	
	private static int nextLarger(TreeNode<Integer> root,int k) {
		ArrayList<Integer> obj=nextLargerhelper(root);
		Collections.sort(obj);
		for(int i=0;i<obj.size();i++) 
		{
			if(obj.get(i)>=k) 
			{
				return obj.get(i);
			}
		}
		return -1;
	}

	private static ArrayList<Integer> nextLargerhelper(TreeNode<Integer> root) {
		ArrayList<Integer> obj=new ArrayList<>();
		if(root==null) 
		{
			return obj;
		}
		obj.add(root.val);
		for(TreeNode<Integer>child:root.children) 
		{
			obj.addAll(nextLargerhelper(child));
		}
		return obj;
	}
}
