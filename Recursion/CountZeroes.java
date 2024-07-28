package Recursion;
import java.util.Scanner;
public class CountZeroes {
	static Scanner sc=new Scanner(System.in);
	static int count =0;
	public static void main(String args[]) 
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(countZeroes(n));
	}
	public static int countZeroes(int n) 
	{
		if(n==0) 
		{
			return 1;
		}
		if(n%10==0) 
		{
			count++;
		}
		countZeroes(n/10);
		return count;
	}
}
