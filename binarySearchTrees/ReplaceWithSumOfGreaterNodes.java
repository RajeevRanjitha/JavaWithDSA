package binarySearchTrees;
import java.util.Scanner;
public class ReplaceWithSumOfGreaterNodes {
	static int sum=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.createBinary();
		obj.printlevelWise(root);
		System.out.println();
		replace(root);
		obj.printlevelWise(root);
	}
	private static void replace(BinaryNodeClass<Integer> root) {
		if(root==null) 
		{
			return;
		}
		replace(root.right);
		sum+=root.val;
		root.val=sum;
		replace(root.left);
	}
}
