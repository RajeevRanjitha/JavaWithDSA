package stack;
import java.util.Scanner;
/*
 * ()()()valid
 * (){[]}({[]}) valid
 * 2+3 valid
 * 2+3([])valid
 * (2+3 not valid
 */
public class CheckValidExpressionUse {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		CheckValidExpression<String>stack=new CheckValidExpression<String>();
		System.out.println("Enter your Expression");
		String str=sc.next();
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='{'  || str.charAt(i)=='[' ) 
			{
				stack.push(str.substring(i,i+1));
			}
			else 
			{
				if(str.charAt(i)==')' || str.charAt(i)=='}'  || str.charAt(i)==']') 
				{
					if(stack.isEmpty()) 
					{
						stack.push(str.substring(i,i+1));
						break;
					}
				}
				else if(stack.isEmpty()) 
				{
					continue;
				}
				else if(stack.peek().equals("(") && str.charAt(i)==')' ||stack.peek().equals("[") && str.charAt(i)==']'||stack.peek().equals("{") && str.charAt(i)=='}') 
				{
					stack.pop();
				}
			}
		}
		if(stack.size_()==0) 
		{
			System.out.println("Valid Expression");
		}
		else 
		{
			System.out.println("Not a valid Expression");
		}
	}
}
