package arrays;
import java.util.Scanner;
public class P7 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		System.out.println("Creating the second array");
		int b[]=create();
		int c[]=sum(a,b);
		print(a);
		print(b);
		print(c);
	}
	public static int [] create () 
	{
		System.out.println("Enter the Size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int [] sum(int a[],int b[]) 
	{
		int c[]=new int[a.length];
		for(int i=0;i<c.length;i++) 
		{
			c[i]=a[i]+b[i];
		}
		return c;
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
