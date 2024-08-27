package genericTrees;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class TakeLevelWiseInput {
	static Scanner sc=new Scanner(System.in);
	TreeNode<Integer>root=null;
	public void takeLevelWiseInput() 
	{
		root=takeLevelWiseInputhelper(root); 
	}
	private TreeNode<Integer> takeLevelWiseInputhelper(TreeNode<Integer>root) 
	{
		if(root==null) 
		{
			System.out.println("Enter the value for the rootNode");
			int x=sc.nextInt();
			root=new TreeNode<Integer>(x);
		}
		Queue<TreeNode<Integer>>q=new LinkedList<TreeNode<Integer>>();
		q.add(root);
		while(!q.isEmpty()) 
		{
			TreeNode<Integer>current=q.poll();
			System.out.println("Enter the number of childrens you want for "+current.val);
			int n=sc.nextInt();
			for(int i=0;i<n;i++) 
			{
				System.out.println("Enter the Children");
				int x=sc.nextInt();
				TreeNode<Integer>child=new TreeNode<>(x);
				current.children.add(child);
				q.add(child);
			}
		}
		return root;
	}
	
}
