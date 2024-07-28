package Recursion;
import java.util.Scanner;
public class CHeckIfArrayIsSortedUsingRecursion {
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
		System.out.println(checkSort(a,0));
	}
	public static boolean checkSort(int a[],int i) 
	{
		if(i==a.length-1) 
		{
			return true;
		}
		if(a[i]>a[i+1]) 
		{
			return false;
		}
		return checkSort(a,i+1);
	}
}
