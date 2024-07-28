package Recursion;
import java.util.Scanner;
public class ArraySum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String aegs[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println(arraySum(a,a.length));
	}
	public static int arraySum(int a[],int n) 
	{
		if(n==1) 
		{
			return a[0];
		}
		int sum=arraySum(a,n-1)+a[n-1];
		return sum;
	}
}
