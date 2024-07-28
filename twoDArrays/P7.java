package twoDArrays;
import java.util.Scanner;
public class P7 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.print("Enter the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		print(a);
		printSpiral(a);
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
	public static void printSpiral(int a[][]) 
	{
		int count=0;
		int total=a.length*a[0].length;
		int f_row=0;
		int f_col=0;
		int l_row=a.length-1;
		int l_col=a[0].length-1;
		while(count<total) 
		{
			for(int i=f_col;i<=l_col && count<=total;i++) 
			{
				System.out.print(a[f_row][i]+" ");
				count++;
			}
			f_row++;
			for(int i=f_row;i<=l_row  && count<=total;i++) 
			{
				System.out.print(a[i][l_col]+" ");
				count++;
			}
			l_col--;
			for(int i=l_col;i>=f_col  && count<=total;i--) 
			{
				System.out.print(a[l_row][i]+" ");
				count++;
			}
			l_row--;
			for(int i=l_row;i>=f_row && count<=total;i--) 
			{
				System.out.print(a[i][f_col]+" ");
				count++;
			}
			f_col++;
		}
	}
}
