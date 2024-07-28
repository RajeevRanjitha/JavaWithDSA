package twoDArrays;
import java.util.Scanner;
public class P10 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("enter the size of the square array");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) 
		{
			sum+=a[0][i];
			sum+=a[n-1][i];
		}
		for(int i=1;i<n-1;i++) 
		{
			sum+=a[i][0];
			sum+=a[i][n-1];
		}
		//sum of diagonal elements
		for(int i=1;i<n-1;i++) 
		{
			sum+=a[i][i];
		}
		int j=n-2;
		//anti diagonal elements;
		for(int i=1;i<n-1;i++) 
		{
			sum+=a[i][j];
			j--;
		}
		print(a);
		System.out.println("the sum of only border Elements is "+sum);
	}
	public static void print(int a[][]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
