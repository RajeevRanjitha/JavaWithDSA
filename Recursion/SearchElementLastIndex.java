package Recursion;
import java.util.Scanner;
public class SearchElementLastIndex {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int index=a.length-1;
		System.out.println("Enter the element you want to search");
		int x=sc.nextInt();
		System.out.println(searchLast(a,index,x));
	}
	public static int searchLast(int a[],int index,int x)
	{
		if(a[index]==x) 
		{
			return index;
		}
		if(index<=0) 
		{
			return -1;
		}
		return searchLast(a,index-1,x);
		
	}
}
