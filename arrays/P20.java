//insertion Sort
package arrays;
import java.util.Scanner;
public class P20 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		System.out.println("Array Before Apllying insertion sort");
		print(a);
		System.out.println("Array After applying the insertion sort");
		sort(a);
		print(a);
	}
	public static int[] create() 
	{
		System.out.println("Enter the size of the array");
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
	public static void sort(int a[]) 
	{
		int j=0;
		for(int i=1;i<a.length;i++) 
		{
			int temp=a[i];
			for(j=i-1;j>=0;j--) 
			{
				if(temp<a[j]) 
				{
					a[j+1]=a[j];
				}
				else 
				{
					break;
				}
			}
			a[j+1]=temp;
		}
	}
}
