package arrays;
import java.util.Scanner;
public class P29 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		int i=0;
		int j=a.length-1;
		while(i<=j) 
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
}
