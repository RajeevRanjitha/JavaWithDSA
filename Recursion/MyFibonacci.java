package Recursion;
import java.util.Scanner;
public class MyFibonacci {
	static Scanner sc=new Scanner(System.in) ;
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of fibanocci sereis you want");
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	public static int fib(int n) 
	{
		if(n==1) 
		{
			return 0;
		}
		if(n==2) 
		{
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
}
