package Recursion;
import java.util.Scanner;
public class SearchOfAnElementInArray {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int x=sc.nextInt();
		System.out.println(search(a,0,x));
	}
	public static boolean search(int a[],int i,int x) 
	{
		if(a[i]==x) 
		{
			return true;
		}
		if(i==a.length-1) 
		{
			if(a[i]==x) 
			{
				return true;
			}
			return false;
		}
		return search(a,i+1,x);
	}
}
