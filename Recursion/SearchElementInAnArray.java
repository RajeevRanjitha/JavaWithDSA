package Recursion;
import java.util.Scanner;
public class SearchElementInAnArray {
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
		System.out.println("Enter the element you want to search in the array");
		int x=sc.nextInt();
		int index=0;
		System.out.println(search(a,index,x));
	}
	public static int search(int a[],int index,int x) 
	{
		if(a[index]==x) 
		{
			return index;
		}
		if(index>=a.length-1) 
		{
			return -1;
		}
		return search(a,index+1,x);
	}
}
