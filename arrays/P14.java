package arrays;
import java.util.Scanner;
public class P14 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		int b[]=create();
		System.out.println("The elements of the array a is");
		print(a);
		System.out.println("The elements of the array b is");
		print(b);
		inter(a,b);
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
	public static int [] create() {
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void inter(int a[],int b[]) 
	{
		System.out.println();
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<b.length;j++) 
			{
				if(a[i]==b[j]) 
				{
					System.out.print(a[i]+" ");
					b[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
	}
}
