package SearchingSortingPractice;
import java.util.Scanner;
public class InsertionSort {
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
		int j=0;
		for(int i=1;i<a.length;i++) 
		{
			int temp=a[i];
			for(j=i-1;j>=0;j--) 
			{
				if(temp>=a[j]) 
				{
					break;
				}
				if(temp<a[j]) 
				{
					a[j+1]=a[j];
				}
			}
			a[j+1]=temp;
		}
	}
}
