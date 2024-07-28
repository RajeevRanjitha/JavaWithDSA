package arrays;
import java.util.Scanner;
public class P25 {
	static Scanner sc=new Scanner(System.in);
		public static void main(String args[]) 
		{
			System.out.println("Enter the Elements of the array A");
			int a[]=create();
			System.out.println("Enter the Elements of the array B");
			int b[]=create();
			System.out.println("The Elements of the array A is");
			print(a);
			System.out.println("The Elements of the array B is");
			print(b);
			int c[]=find(a,b);
			System.out.println("The Elemnts corresponds to A is i.e, count of elements smaller than ith elements of A ");
			print(c);
		}
		public static int [] create() 
		{
			System.out.println("Enter the Size of the array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the Elements of the array");
			for(int i=0;i<a.length;i++) 
			{
				a[i]=sc.nextInt();
			}
			return a;
		}
		public static void print(int a[])
		{
			System.out.println();
			for(int i=0;i<a.length;i++) 
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		public static int[] find(int a[],int b[]) 
		{
			int c[]=new int[a.length];
			for(int i=0;i<a.length;i++) 
			{
				int count =0;
				for(int j=0;j<b.length;j++) 
				{
					if(a[i]>=b[j]) 
					{
						count++;
					}
				}
				c[i]=count;
			}
			return c;
		}
}
