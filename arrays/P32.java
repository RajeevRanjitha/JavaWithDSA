package arrays;
import java.util.Scanner;
public class P32 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the starting position where you want to start the rotation");
		int start=sc.nextInt();
		System.out.println("Enter the ending position where you wnat to stop the rotaion");
		int end=sc.nextInt();
		while(start<=end) 
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println("After reversing the array in the given range is");
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");
		}
	}
}
