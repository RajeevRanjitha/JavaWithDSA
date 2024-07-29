package SearchingSortingPractice;
import java.util.Scanner;
public class BubbleSort {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		sort(a);
		print(a);
	}
	public static void print(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void sort(int a[]) 
	{
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=0;j<a.length-i-1;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
