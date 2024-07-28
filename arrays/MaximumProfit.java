package arrays;
import java.util.Scanner;
public class MaximumProfit {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int b[]=profit(a);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<b.length;i++) 
		{
			if(b[i]>max) 
			{
				max=b[i];
			}
		}
		System.out.println(max);
	}
	public static int [] profit(int a[]) 
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) 
		{
			int sum=0;
			for(int j=0;j<a.length;j++) 
			{
				if(a[i]<=a[j]) 
				{
					sum+=a[i];
				}
			}
			b[i]=sum;
		}
		return b;
	}
	
}
