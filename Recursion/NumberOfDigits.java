package Recursion;
import java.util.Scanner;
public class NumberOfDigits {
	static int count =0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println(countnum(n));
	}	
	public static int countnum(int n) 
	{
		if(n/10==0) 
		{
			count++;
			return count;
		}
			count++;
			countnum(n/10);
			return count ;
	}
}
