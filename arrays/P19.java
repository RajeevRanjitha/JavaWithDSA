//bubble Sort
package arrays;
import java.util.Scanner;
public class P19 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		System.out.println("Array Before Apllying Bubble sort");
		print(a);
		System.out.println("Array After applying the Bubble sort");
		sort(a);
		print(a);
		System.out.println("enter the position");
		int k=sc.nextInt();
		System.out.println("The element you want at the "+(kth(a,k)+1)+"is "+a[kth(a,k)]);
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
		boolean val=true;
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=0;j<a.length-i-1;j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					val=false;
				}
			}
			if(val) 
			{
				System.out.println("Already in the sorted Order");
				break;
			}
		}
	}
	public static int kth (int a[],int k) 
	{
		for(int i=0;i<a.length;i++) 
		{
			if(i==k-1) 
			{
				return k-1;
			}
		}
		return 0;
	}
}
