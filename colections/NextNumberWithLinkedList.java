package colections;
import java.util.Scanner;
import java.util.Stack;
public class NextNumberWithLinkedList {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the digits of the number");
		Stack<Integer>stack=new Stack<Integer>(),stack2=new Stack<>();
		int val=sc.nextInt();
		stack.push(val);
		while(!stack.isEmpty()) 
		{
			int temp=stack.pop();
			if(temp==9) 
			{
				stack2.push(0);
				temp=stack.pop();
				stack2.push(temp+1);
			}
			else 
			{
				stack2.push(stack.pop());
			}
		}
	}
}
