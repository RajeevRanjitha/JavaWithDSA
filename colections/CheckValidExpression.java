package colections;
import java.util.Stack;
import java.util.Scanner;
public class CheckValidExpression {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Stack<String> stack=new Stack<String>();
		System.out.println("Enter the Expression");
		String str=sc.next();
		stack.push("");
		for(int i=0;i<str.length();i++) 
		{
			String str1=stack.peek();
			if (str.substring(i,i+1).equals("[") || str.substring(i,i+1).equals("]") || str.substring(i,i+1).equals("{") || str.substring(i,i+1).equals("}") || str.substring(i,i+1).equals("(") || str.substring(i,i+1).equals(")")) {
				stack.push(str.substring(i,i+1));
			}
			if(str1.equals("(") && str.substring(i,i+1).equals(")")) 
			{
				stack.pop();
				stack.pop();
			}
			else if(str1.equals("{") && str.substring(i,i+1).equals("}")) 
			{
				stack.pop();
				stack.pop();
			}
			else if(str1.equals("[") && str.substring(i,i+1).equals("]")) 
			{
				stack.pop();
				stack.pop();
			}
		}
		stack.pop();
		if(stack.size()==0) 
		{
			System.out.println("valid Expression");
		}
		else 
		{
			System.out.println("Invalid Expression");
		}
	}
}
