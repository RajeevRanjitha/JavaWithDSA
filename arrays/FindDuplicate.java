package arrays;
import java.util.Scanner;
public class FindDuplicate {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		System.out.println("Enter the size of hte array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		duplicate(a);
	}
	public static void duplicate(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("The element is found at "+a[i]);
					break;
				}
			}
		}
	}
}

