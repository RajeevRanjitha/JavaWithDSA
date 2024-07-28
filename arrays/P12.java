package arrays;
import java.util.Scanner;
public class P12 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		System.out.println("Enter the candies that you have");
		int m=sc.nextInt();
		boolean b[]=check(a,m);
		print(b);
	}
	public static int [] create () 
	{
		System.out.println("Enter the size of the childrens array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
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
	public static void print(boolean a[]) 
	{
		System.out.println();
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static boolean[] check(int a[],int m) 
	{
		boolean b[]=new boolean[a.length];
		for(int i=0;i<b.length;i++) 
		{
			b[i]=true;
		}
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				if((a[i]+m)<a[j]) 
				{
					b[i]=false;
					break;
				}
			}
		}
		return b;
		
	}
}
