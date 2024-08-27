package genericTrees;
import java.util.ArrayList;
import java.util.Collections;
public class SecondLargestInGenericTrees {
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println("The Second Largest Element in the tree is "+secondLargest(obj.root));
	}
	private static int  secondLargest(TreeNode<Integer> root) {
		ArrayList<Integer>obj=secondLargestInGenericTreeshelper(root);
		Collections.sort(obj);
		return obj.get(obj.size()-2);
	}
	private static ArrayList<Integer> secondLargestInGenericTreeshelper(TreeNode<Integer> root) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		if(root==null) 
		{
			return new ArrayList<Integer>();
		}
		obj.add(root.val);
		for(TreeNode<Integer>child:root.children) 
		{
			obj.addAll(secondLargestInGenericTreeshelper(child));
		}
		return obj;
	}
}
