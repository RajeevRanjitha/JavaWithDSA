package arrays;
import java.util.Scanner;
public class P16 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		System.out.println("Array Before Apllying Selection sort");
		print(a);
		System.out.println("Array After applying the selection sort");
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
		for(int i=0;i<a.length-1;i++) 
		{
			int min=i;
			int temp=a[i];
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[min]>a[j]) 
				{
					min=j;
				}
			}
			a[i]=a[min];
			a[min]=temp;
			
		}
	}
}
