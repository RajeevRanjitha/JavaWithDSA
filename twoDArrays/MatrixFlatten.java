package twoDArrays;
import java.util.Scanner;
public class MatrixFlatten {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the no. of rows");
		int n=sc.nextInt();
		System.out.println("enter the number of columns");		
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[]=new int[a.length*a[0].length];
		int k=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				b[k]=a[i][j];
				k++;
			}
		}
		
		System.out.println();
		for(int i=0;i<b.length;i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}
