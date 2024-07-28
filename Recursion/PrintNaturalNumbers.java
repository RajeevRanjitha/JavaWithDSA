package Recursion;
import java.util.Scanner;
public class PrintNaturalNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the total number of elements you want to print ");
		int n=sc.nextInt();
		print(n);
	}
	public static void print(int n) 
	{
		if(n==0) 
		{
			return;
		}
		print(n-1);
		System.out.println(n);
	}
}
