package arrays;
import java.util.Scanner;
public class P35 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of Houses");
		int n=sc.nextInt();
		System.out.println("Enter the candies distributed by Person1 to the houses");
		int a[]=create(n);
		System.out.println("Enter the candies distributed by Person2 to the houses");
		int b[]=create(n);
		System.out.println("Enter the candies that you have in your hand");
		int x=sc.nextInt();
		int output[]=new int[n];
		int i=0;
		for( i=0;i<a.length-1;i++) 
		{
			output[i]+=a[i]+b[i];
			if(output[i]>x) 
			{
				output[i+1]=output[i]-x;
				output[i]=x;
			}
		}
		output[i]+=x;
		if(output[i]>x) 
		{
			output[i]=x;
		}
		System.out.println("The peoples house contains ");
		for(i=0;i<output.length;i++) 
		{
			System.out.print(output[i]+" ");
		}
	}
	public static int [] create(int n) 
	{
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
}
