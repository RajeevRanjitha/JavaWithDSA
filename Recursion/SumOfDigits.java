package Recursion;
import java.util.Scanner;
public class SumOfDigits 
{
	static int count=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(sumDigits(n));
	}
	public static int sumDigits(int n) 
	{
		if(n==0) 
		{
			return 0;
		}
		return n%10+sumDigits(n/10);
	}
}
