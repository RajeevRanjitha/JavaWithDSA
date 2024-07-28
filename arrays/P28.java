package arrays;
import java.util.Scanner;
public class P28 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[a.length];
		for(int i=0;i<b.length;i++) 
		{
			b[(i+1)%b.length]=a[i];
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
		for(int i=0;i<b.length;i++) 
		{
			b[(((i-1)%b.length)+b.length)%b.length]=a[i];
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
		
	}
}
