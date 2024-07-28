package arrays;
import java.util.Scanner;
public class P21 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		int b[]=create();
		System.out.println("You entered the Elements of array A are");
		print(a);
		System.out.println("You entered the Elements of array B are");
		print(b);
		System.out.println(" the Elements of array A  after sorting");
		sort(a);
		print(a);
		System.out.println(" the Elements of array B  after sorting");
		sort(b);
		print(b);
		int c[]=merge(a,b);
		System.out.println("The array after merging is ");
		print(c);
	}
	public static int[] create() 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int[] merge(int a[],int b[]) 
	{
		int n=a.length+b.length;
		int c[] =new int[n];
		int j=0;
		int i=0;
		int k=0;
		for(i=0;(i<a.length && j< b.length) ;) 
		{
			if(a[i]>=b[j]) 
			{
				c[k++]=b[j];
				j++;
			}
			else 
			{
				c[k++]=a[i];
				i++;
			}
		}
		while(i<a.length) 
		{
			c[k++]=a[i];
			i++;
		}
		while(j<b.length) 
		{
			c[k++]=b[j];
			j++;
		}
		return c;
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
