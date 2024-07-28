package arrays;
import java.util.Scanner;
public class P11 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the Size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		for(i=0;i<n/2;i++)
		{
			a[i]=sc.nextInt();
			a[n-1-i]=sc.nextInt();
		}
		if(n%2!=0) 
		{
			a[i]=sc.nextInt();
		}
		print(a);
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
}
