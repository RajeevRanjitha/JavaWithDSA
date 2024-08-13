package trees;
import java.util.Scanner;
public class SearchForAnElementXInTheTree {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println("Enter the Elment you want to search in the tree");
		int x=sc.nextInt();
		boolean val=search(root,x);
		if(val) 
		{
			System.out.println("The value is Found in the Tree");
		}
		else 
		{
			System.out.println("The Element is not found in the tree");
		}
	}
	private static boolean search(BinaryNodeClass<Integer> root, int x) {
		if(root==null) 
		{
			return false;
		}
		if(root.val==x) 
		{
			return true;
		}
		else 
		{
			boolean val1=search(root.left, x);
			boolean val2=search(root.right,x);
			return val1||val2;
		}
	}
}
