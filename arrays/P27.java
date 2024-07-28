package arrays;
import java.util.Scanner;
public class P27 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<0) 
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
}
