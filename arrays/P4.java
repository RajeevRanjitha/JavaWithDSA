package arrays;
import java.util.Scanner;
public class P4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the aarray");
		int n=sc.nextInt();
		int arr[]=create(n);
		System.out.println("Enter the Element you want to Search");
		int x=sc.nextInt();
		System.out.println(search(arr,x));
	}
	public static int[] create(int n) 
	{
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int search(int a[],int x) 
	{
		for(int i=0;i<a.length;i++) 
		{
			if(x==a[i]) 
			{
				System.out.println("The Element is found at the index "+i);
				return i;
			}
		}
		return -1;
	}
}
