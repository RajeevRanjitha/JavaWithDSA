package arrays;
import java.util.Scanner;
public class P13 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		if(n%2!=0) 
		{
			unique(arr);
		}
		System.out.println()
;		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
	}
	public static void unique(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			int count =0;
			int ind=0 ;
			for(int j=0;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
					ind=j;
					
				}
			}
			if(count==1) 
			{
				System.out.println("The element is at the index of"+ind+" and the element is at "+a[ind]);
				break;
			}
		}
	}
}
