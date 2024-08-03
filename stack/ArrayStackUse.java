package stack;
import java.util.Scanner;
public class ArrayStackUse {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws StacKFullException, StackEmptyException 
	{
		ArrayStack stack=new ArrayStack();
		System.out.println(stack.top_());
		System.out.println(stack.isEmpty());		
		stack.push(10);
		stack.push(11);
		stack.push(100);
		System.out.println(stack.size());
		System.out.println(stack.top_());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.top_());
		stack.push(100);
		System.out.println(stack.top_());
	}
}
