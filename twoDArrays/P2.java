package twoDArrays;
import java.util.Scanner;
public class P2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[m][n];
		int b[]=new int[m*n];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		int k=0;
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				b[k]=a[j][i];
				k++;
			}
		}
		System.out.println("The elements in the columns wise is");
		for(int i=0;i<b.length;i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}
