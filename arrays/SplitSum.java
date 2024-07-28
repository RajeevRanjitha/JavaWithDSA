package arrays;
import java.util.Scanner;
public class SplitSum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int sum1=0;
		int sum2=0;
		int sum3=0;
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%5==0)
			{
				sum1+=a[i];
			}
			else if(a[i]%3==0) 
			{
				sum2+=a[i];
			}
			else 
			{
				sum3+=a[i];
			}
		}
		if(sum1==sum2+sum3) 
		{
			System.out.println("Split sum Equals");
		}
		else 
		{
			System.out.println("Split sum not equals");
		}
	}
	
}
