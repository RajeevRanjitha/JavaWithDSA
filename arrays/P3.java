package arrays;
import java.util.Scanner;
public class P3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the Size of the Array");
		int n=sc.nextInt();
		int arr[]=create(n);
		System.out.println(large(arr));
		System.out.println(min(arr));
	}
	public static int[] create(int n) 
	{
		int a[]=new int[n];
		System.out.println("Enter the elements of the Array");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int large(int a[]) 
	{
		int large=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) 
		{
			if(large<a[i]) 
			{
				large=a[i];
			}
		}
		return large;
	}
	public static int min(int arr[]) 
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) 
		{
			if(min>arr[i]) 
			{
				min=arr[i];
			}
		}
		return min;
	}
}
