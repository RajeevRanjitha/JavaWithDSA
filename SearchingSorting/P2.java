package SearchingSorting;
import java.util.Scanner;
public class P2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements in the Sorted Order");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to Search");
		int x=sc.nextInt();
		int start=0;
		int end=a.length-1;
		while(start<=end) 
		{
			int mid=(start+end)/2;
			if(a[mid]==x) 
			{
				System.out.println("The element "+a[mid]+"is Found at "+mid);
				return;
			}
			else if(x>a[mid]) 
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		System.out.println(start-1);
	}
}
