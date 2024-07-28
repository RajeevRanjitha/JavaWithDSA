package arrays;
import java.util.Scanner;
public class P22 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array .. enter only 1's 2's ad 0's");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		sort(a);
		System.out.println("After single for loop sorting,  the array is");
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void sort(int a[]) 
	{
		int start =0,mid=0;
		int end=a.length-1;
		while(mid<=end) 
		{
			if(a[mid]==0) 
			{
				int temp=a[mid];
				a[mid]=a[start];
				a[start]=temp;
				start++;
				mid++;
			}
			else if(a[mid]==1) 
			{
				mid++;
			}
			else 
			{
				int temp=a[end];
				a[end]=a[mid];
				a[mid]=temp;
				end--;
			}
		}
	}
}
