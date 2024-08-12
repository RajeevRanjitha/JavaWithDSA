package trees;
import java.util.Scanner;
public class TotalNumberOfNodesGreaterThanTheGivenValue {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.levelWiseInput();
		System.out.println("Enter the value that you want to give");
		int n=sc.nextInt();
		System.out.println(totalCount(root,n));
	}

	private static int totalCount(BinaryNodeClass<Integer> root,int n) {
		if(root==null) 
		{
			return 0;
		}
		int flag=0;
		if(root.val>n) 
		{
			flag++;
		}
		int leftCount=totalCount(root.left,n);
		int rightCount=totalCount(root.right,n);
		return leftCount+rightCount+flag;
	}
}
