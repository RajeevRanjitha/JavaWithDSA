package arrays;
import java.util.Scanner;
public class EquilibriumBestSolution {
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
	public static void equilibrium(int a[]) 
	{
		int leftsum=0;
		int rightsum=0;
		for(int i=0;i<a.length;i++) 
		{
			rightsum+=a[i];
		}
		for(int i=0;i<a.length-1;i++) 
		{
			rightsum-=a[i];
			if(rightsum==leftsum) 
			{
				System.out.println("The Equilibrium is founs at index "+i);
			}
			leftsum+=a[i];
		}
	}
}
