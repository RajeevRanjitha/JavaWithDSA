package arrays;
import java.util.Scanner;
import java.util.*;
public class ArrayIntersection {
	static Scanner sc=new Scanner(System.in);
	static HashSet <Integer> obj=new HashSet<Integer>();
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
		System.out.println("Enter the size of the Second aray");
		int m=sc.nextInt();
		System.out.println("Enter the elemnts of the Second array");
		int b[]=new int[m];
		for(int i=0;i<b.length;i++) 
		{
			b[i]=sc.nextInt();
		}
		HashSet<Integer> obj1=intersection1(a,b);
		System.out.println("The Intersection Elements found are");
		for(Integer x:obj1) 
		{
			System.out.print(x+" ");
		}
	}
	public static HashSet intersection1(int a[],int b[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<b.length;j++) 
			{
				if(a[i]==b[j]) 
				{
					obj.add(a[i]);
				}
			}
		}
		return obj;
	}
}
