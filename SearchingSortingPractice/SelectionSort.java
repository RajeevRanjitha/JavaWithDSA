package SearchingSortingPractice;
import java.util.Scanner;
public class SelectionSort {
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
			int min=i;
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[min]>a[j]) 
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
}
