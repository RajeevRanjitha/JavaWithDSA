package Recursion;
import java.util.Scanner;
public class CountOfDigits {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(count(n));
	}
	public static int count(int n) 
	{
		if(n/10==0) 
		{
			return 1;
		}
		return count(n/10)+1;
	}
}
