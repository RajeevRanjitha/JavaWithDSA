package arrays;
import java.util.Scanner;
public class P9 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String ags[]) 
	{
		int a[]=create();
		print(a);
		printpairs(a);
		System.out.println();
		System.out.println(countsum(a));
	}
	public static int [] create () 
	{
		System.out.println("Enter the Size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void printpairs(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				System.out.print("("+a[i]+","+a[j]+")"+" ");
			}
		}
	}
	public static int countsum(int a[]) 
	{
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		int count =0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]+a[j]==x)
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void print(int a[]) 
	{
		System.out.println();
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
