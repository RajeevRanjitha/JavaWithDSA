package twoDArrays;
import java.util.Scanner;
public class P8 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[m][n];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		transpose(a,b);
		print(a);
		System.err.println();
		print(b);
	}
	public static void transpose(int a[][],int b[][]) 
	{
		for(int i=0;i<a[0].length;i++) 
		{
			for(int j=0;j<a.length;j++) {
				b[i][j]=a[j][i];
			}
		}
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
	}
}
