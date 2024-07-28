package arrays;
import java.util.Scanner;
public class P36 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		int m[][]=new int[5][];
		for(int i=0;i<m.length;i++) 
		{
			System.out.println("enter the size of the 1st Array");
			int n=sc.nextInt();
			System.out.println("enter the "+(i+1)+"th array Elements");
			m[i]=new int[n];
			for(int j=0;j<n;j++) 
			{
				m[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m.length;i++) 
		{
			for(int j=0;j<m[i].length;j++) 
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
