package twoDArrays;
import java.util.Scanner;
public class MatrixOperationsQuery
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		System.out.println("Etner the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("choose the query");
		System.out.println("Enter the Query numer");
		int q=sc.nextInt();
		print(a);
		while(true) {
		if(q==1) 
		{
			System.out.println("Enter the character 'C' or 'R' ");
			char ch=sc.next().charAt(0);
			if(ch=='C') 
			{
				System.out.println("Enter the Index");
				int x=sc.nextInt();
				for(int i=0;i<a.length;i++) 
				{
					a[i][x]=1-a[i][x];
				}
			}
			else if(ch=='R') 
			{
				System.out.println("Enter the Index");
				int x=sc.nextInt();
				for(int j=0;j<a[0].length;j++) 
				{
					a[x][j]=1-a[x][j];
				}
			}
			else 
			{
				System.out.println("Enter a valid character"); 
			}
			System.out.println("choose the query");
			System.out.println("Enter the Query numer");
			q=sc.nextInt();
			print(a);
		}
		else if(q==2) 
		{
			System.out.print("Enter the character C or R");
			char ch=sc.next().charAt(0);
			if(ch=='R') 
			{
				System.out.println("Enter the Index");
				int x=sc.nextInt();
				int count =0;
				for(int i=0;i<a[0].length;i++) 
				{
					if(a[x][i]==0) 
					{
						count++;
					}
				}
				System.out.println("The number of Zeros in Row "+x+"is "+count);
				System.out.println(count);
				break;
			}
			else if(ch=='C') 
			{
				System.out.println("Enter the Index");
				int x=sc.nextInt();
				int count =0;
				for(int i=0;i<a.length;i++) 
				{
					if(a[i][x]==0) 
					{
						count++;
					}
				}
				System.out.println("The number of Zeros in column "+x+"is "+count);
				break;
			}
			else 
			{
				System.out.println("Enter a valid number");
				break;
			}
		}	
		else 
		{
			System.out.println("Enter a valid number");
			break;
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