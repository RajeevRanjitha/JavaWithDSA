package arrays;
import java.util.Scanner;
public class P5 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the aarray");
		int n=sc.nextInt();
		int arr[]=create(n);
		System.out.println("Before applying Incrementation");
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println(arr);
		increment(arr);
		System.out.println(increment(arr));
		System.out.println();
		System.out.println("After applying Incrementation");
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
	}
	public static int[] create(int n) 
	{
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int [] increment (int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			a[i]++;
		}
		return a;
	}
	
}
