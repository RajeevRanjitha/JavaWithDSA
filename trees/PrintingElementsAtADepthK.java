package trees;
import java.util.Scanner;
public class PrintingElementsAtADepthK {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println("The nodes in the tree is");
		obj.printlevelWise(root);
		System.out.println("Enter the value of Depth you want");
		int k=sc.nextInt();
		printDepth(root,k);
		
	}
	private static void printDepth(BinaryNodeClass<Integer> root, int k) {
		if(root==null) 
		{
			return;
		}
		else if(k==0) 
		{
			System.out.println(root.val);
		}
		else 
		{
			printDepth(root.left,k-1);
			printDepth(root.right,k-1);
		}
	}
}
