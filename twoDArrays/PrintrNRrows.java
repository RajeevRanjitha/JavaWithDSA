package twoDArrays;
import java.util.Scanner;
public class PrintrNRrows {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) 
		{
			for(int k=i;k<n;k++) 
			{
				for(int j=0;j<a[0].length;j++) 
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
