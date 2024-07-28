package Recursion;
import java.util.Scanner;
public class SearchLastIndex {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int x=sc.nextInt();
		System.out.println(last(a,a.length-1,x));
	}
	public static int last(int a[],int n,int x) 
	{
		if(n<0) 
		{
			return -1;
		}
		if(a[n]==x) 
		{
			return n;
		}	
		return last(a,n-1,x);
	}
}
