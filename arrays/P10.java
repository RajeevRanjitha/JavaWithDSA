package arrays;
import java.util.Scanner;
public class P10 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		print(a);
		swap(a);
		System.out.println("After swapping the Array is");
		print(a);
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
	public static void print(int a[]) 
	{
		System.out.println();
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void swap(int a[]) 
	{
		for(int i=0;i<a.length-1;i=i+2) 
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
}
