package twoDArrays;
import java.util.Scanner;
public class P6 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[][]=create();
		print(a);
		System.out.println(largestSumrow(a));
	}
	public static int[][] create()
	{
		System.out.println("enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	public static void print(int a[][]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static int largestSumrow(int a[][]) 
	{
		int max=0;
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			sum=0;
			for(int j=0;j<a[0].length;j++) 
			{
				sum+=a[i][j];
			}
			if(sum>max) 
			{
				max=sum;
			}
		}
		return max;
	}
}
