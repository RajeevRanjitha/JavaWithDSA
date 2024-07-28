package arrays;
import java.util.Scanner;
public class P37 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		boolean val=true;
		int i=0;
		for(i=0;i<a.length-1;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) 
				{
					val=false;
					break;
				}
			}
			if(val) 
			{
				System.out.println(a[i]);
			}
			val=true;
		}
		System.out.println(a[i]);
	}
}
