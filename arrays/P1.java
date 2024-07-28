package arrays;
import java.util.Scanner;
public class P1 {

	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=createarr(n);
		display(arr);
		
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
	public static void display(int a[]) 
	{
		System.out.println("The Elements of the rray that you entered is ");
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
}
