package twoDArrays;
import java.util.Scanner;
public class WaveTraversal {
	static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of rows");
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
		printweave(a);
	}
	public static void printweave(int a[][]) 
	{
		int ind1=0;
			for(int i=0;i<a[0].length ;i+=2) 
			{
				for(int j=0;j<a.length;j++) 
				{
					System.out.print(a[j][ind1]+" ");
				}
				ind1++;
				i++;
				for(int j=a.length-1 ;j>=0 ;j--) 
				{
					System.out.print(a[j][ind1]+" ");
				}
				ind1++;
			}
			if(a.length%2!=0) 
			{
				for(int j=0;j<a.length;j++) 
				{
					System.out.print(a[j][ind1]+" ");
				}
			}
	}
}
