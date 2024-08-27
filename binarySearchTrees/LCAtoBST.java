package binarySearchTrees;
import java.util.Scanner;
public class LCAtoBST {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.createBinary();
		System.out.println("Enter the 1st Number");
		int m=sc.nextInt();
		System.out.println("Enter the Second Number");
		int n=sc.nextInt();
		if(lca(root,m,n)!=null) {
		System.out.println(lca(root,m,n).val);
		}
		else 
		{
			System.out.println("No common Ancestor or the Elements not found");
		}
	}

	private static BinaryNodeClass<Integer> lca(BinaryNodeClass<Integer> root,int m,int n) {
		if(root==null) 
		{
			return null;
		}
		if(m> root.val && n>root.val) 
		{
			return lca(root.right,m,n);
		}
		if(m<root.val && n<root.val) 
		{
			return lca(root.left,m,n);
		}
		return root;
	}
}
