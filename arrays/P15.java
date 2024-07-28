package arrays;
import java.util.Scanner;
public class P15 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.print("Enter the Size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to find the triplets");
		int x=sc.nextInt();
		int count =0;
		for(int i=0;i<a.length-2;i++) 
		{
			for(int j=i+1;j<a.length-1;j++) 
			{
				for(int k=j+1;k<a.length;k++) 
				{
					if(a[i]+a[j]+a[k]==x) 
					{
						System.out.println("Triplets are "+a[i]+" "+a[j]+" "+a[k]);
						count ++;
					}
				}
			}
		}
		System.out.println("The number of triplets are"+count);
	}
}
