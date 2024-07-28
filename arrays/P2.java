package arrays;
import java.util.Scanner;
public class P2 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=createarr(n);
		System.out.println(sum(arr));
	}
	public static int [] createarr(int n) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		System.out.println("Enter the Elements of the Array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int sum(int a[]) 
	{
		int val=0;
		for(int i=0;i<a.length;i++) {
			val+=a[i];
		}
		return val;
	}
}
