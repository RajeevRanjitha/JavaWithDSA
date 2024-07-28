package arrays;
import java.util.Scanner;
public class P23 {
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
		sort(a);
		System.out.println("Elements after Sorting is ");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The Second Largest Element in the Given array is "+a[a.length-2]);
	}
	public static void sort(int a[]) 
	{
		int j=0;
		for(int i=1;i<a.length;i++) 
		{
			int temp=a[i];
			for(j=i-1;j>=0;j--) 
			{
				if(temp<a[j]) 
				{
					a[j+1]=a[j];
				}
				else 
				{
					a[j+1]=temp;
					break;
				}
			}
			a[j+1]=temp;
		}
	}
}
