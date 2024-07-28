package arrays;
import java.util.Scanner;
public class P8 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		printpairs(a);
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
}
