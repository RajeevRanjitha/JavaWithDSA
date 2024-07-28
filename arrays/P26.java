package arrays;
import java.util.Scanner;
public class P26 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		pushzero(a);
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void pushzero(int a[]) 
	{
		int mid=0;
		int start=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[mid]==0) 
			{
				mid++;
			}
			else 
			{
				int temp=a[mid];
				a[mid]=a[start];
				a[start]=temp;
				start++;
				mid++;
			}
		}
	}
}
