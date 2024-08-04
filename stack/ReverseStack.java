package stack;
import java.util.Scanner;
public class ReverseStack {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws EmptYException 
	{
		LinkedListStack<String> stack=new LinkedListStack<>();
		System.out.println("Enter the Elemetns you want to Push in the Stack");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the Value You want to Push");
			String str=sc.next();
			stack.push(str);
		}
		System.out.println("Stack Before Revering");
		stack.print();
		LinkedListStack<String> reverse =reverse(stack);
		System.out.println("Stack After Reversing");
		reverse.print();
	}
	public static LinkedListStack<String> reverse(LinkedListStack<String>stack) throws EmptYException
	{
		LinkedListStack<String>stackReverseHelper=new LinkedListStack<String>();
		int n=stack.size();
		for(int i=0;i<n;i++) 
		{
			stackReverseHelper.push(stack.pop());
		}
		return stackReverseHelper;
	}
}