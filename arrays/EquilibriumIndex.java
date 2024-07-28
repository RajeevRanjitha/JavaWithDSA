package arrays;
import java.util.Scanner;
public class EquilibriumIndex {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		equilibrium(a);
	}
	public static void  equilibrium(int a[]) 
	{
		for(int i=1;i<a.length;i++) 
		{
			int leftsum=0;
			int rightsum=0;
			for(int j=i-1;j>=0;j--) 
			{
				leftsum+=a[j];
			}
			for(int j=i+1;j<a.length;j++) 
			{
				rightsum+=a[j];
			}
			if(leftsum==rightsum) 
			{
				System.out.println("The ExuilibriumIndex is at "+i);
			}
		}
	}
	public static int sum(int a[]) 
	{
		int sum=0;
		for(int i=2;i<a.length;i++) 
		{
			sum+=a[i];
		}
		return sum;
	}
}
