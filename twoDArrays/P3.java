package twoDArrays;
import java.util.Scanner;
public class P3{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<m;j++) 
			{
				sum+=a[i][j];
			}
			System.out.print(sum+" ");
			sum=0;
		}
	}
}
