package arrays;
import java.util.Scanner;
public class P6 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=create(n);
		int p[]=formnew(arr);
		System.out.println("Original array is");
		print(arr);
		System.out.println("Prefix sum array is");
		print(p);
	}
	public static int[] create(int n) {
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=sc.nextInt();
	}
	return arr;
	}
	public static int [] formnew(int a[]) 
	{
		int p[]=new int[a.length];
		for(int i=0;i<p.length;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				p[i]+=a[j];
			}
		}
		return p;
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
