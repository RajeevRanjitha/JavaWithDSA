package Recursion;
import java.util.Scanner;
public class SumArray {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter te size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println(sum(a,a.length-1));
		
	}
	public static int sum(int a[],int n) 
	{
		if(n==0) 
		{
			return a[0];
		}
		return a[n]+sum(a,n-1);
	}
}
