package twoDArrays;
import java.util.Scanner;
public class P4 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[][]=create();
		print(a);
		squarediagnol(a);
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
				System.out.println(a[i][j]);
			}
		}
	}
	public static void squarediagnol(int a[][]) 
	{
		if(a.length==a[0].length) 
		{
			System.out.println("It is a Square Matrix");
			System.out.println("And the diagonal Elements are");
			for(int i=0;i<a.length;i++) 
			{
				System.out.println(a[i][i]);
			}
		}
		else 
		{
			System.out.println("It is not a square Matrix");
		}
	}
}
