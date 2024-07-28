package arrays;
import java.util.Scanner;
public class P24 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the Elements of array A");
		int a[]=create();
		System.out.println("Enter the Elements of array B");
		int b[]=create();
		System.out.println("The Elements of the array A is");
		print(a);
		System.out.println("The Elements of the B is ");
		print(b);
		smallDifferPair(a,b);
	}
	public static int[] create() 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements of the array");
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
	public static void smallDifferPair(int a[], int b[]) 
	{
		int small=Integer.MAX_VALUE;
		int m=0;
		int n=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<b.length;j++) 
			{
				if(Math.abs(a[i]-b[j])<small) 
				{
					small=Math.abs(a[i]-b[j]);
					m=i;
					n=j;
				}
			}
		}
		System.out.println("The Smallest Difference is found at "+m+"th position of array A and "+n+"th postion of Array B and the Differnece is "+small);
	}
}
