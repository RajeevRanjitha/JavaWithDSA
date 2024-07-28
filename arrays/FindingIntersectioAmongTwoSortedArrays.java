package arrays;
import java.util.Scanner;
public class FindingIntersectioAmongTwoSortedArrays {
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
		System.out.println("Enter the size of the second array");
		int m=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int b[]=new int[m];
		for(int i=0;i<b.length;i++) 
		{
			b[i]=sc.nextInt();
		}
		intersection(a,b);
	}
	public static void intersection(int a[],int b[]) 
	{
		int i=0;
		int j=0;
		while(i<a.length &&j<b.length) 
		{
			if(a[i]<b[j]) 
			{
				i++;
			}
			else if(a[i]==b[j]) 
			{
				System.out.println(a[i]);
				i++;
				j++;
			}
			else 
			{
				j++;
			}
		}
	}
}
