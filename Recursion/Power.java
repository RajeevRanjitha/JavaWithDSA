package Recursion;
import java.util.Scanner;
public class Power {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the power");
		int x=sc.nextInt();
		System.out.println(pow(n,x));
	}
	public static int pow(int n,int x) 
	{
		if(x==1) 
		{
			return n;
		}
		return n*pow(n,x-1);
	}
}
