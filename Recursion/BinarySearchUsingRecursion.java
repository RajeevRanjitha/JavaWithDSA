package Recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("To implement the binary search we need to sort the array");
		sort(a);
		System.out.println("Elements after Sorting is");
		print(a);
		System.out.println("Enter the element you want to search");
		int x=sc.nextInt();
		if(search(a,x,0,a.length-1)) 
		{
			System.out.println("The element is found in the array");
		}
		else 
		{
			System.out.println("The element is not found");
		}
	}
	public static void print(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	public static boolean search(int a[],int x,int start,int end) 
	{
		if(start>end) 
		{
			return false;
		}
		int mid=(start+end)/2;
		if(a[mid]==x) 
		{
			return true;
		}
		else if(x>a[mid]) 
		{
			return search(a,x,mid+1,end);
		}
		else 
		{
			return search(a,x,start,mid-1);
		}
	}
	public static void sort(int a[]) 
	{
		//InsertionSort......
		int j=0;
		for(int i=1;i<a.length;i++) 
		{
			int temp=a[i];
			for(j=i-1;j>=0;j--) 
			{
				if(temp>=a[j]) 
				{
					break;
				}
				if(temp<a[j]) 
				{
					a[j+1]=a[j];
				}
			}
			a[j+1]=temp;
		}
	}
}
