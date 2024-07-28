package Recursion;
import java.util.Scanner;
public class Factorial
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	public static int fact(int n) 
	{
		if(n==0) 
		{
			return 1;
		}
		return n*fact(n-1);
	}
}