package arrays;
import java.util.Scanner;
public class P34 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int a[]=create();
		print(a);
		int b[]=create();
		print(b);
		int c[]=sum(a,b);
		System.out.println("The sum of the Two arrays is");
		print(c);
	}
	public static int [] create() 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int [] sum(int a[], int b[]) 
	{
		int c[];
		int max=Math.max(a.length,b.length);
		c=new int[max+1];
		int sum=0;
		int carry=0;
		int index1=a.length-1;
		int index2=b.length-1;
		for(int i=c.length-1;i>=0;i--) 
		{
			sum=carry;
			if(index1>=0) 
			{
				sum+=a[index1];
				index1--;
			}
			if(index2>=0) 
			{
				sum+=b[index2];
				index2--;
			}
			int r=sum%10;
			c[i]=r;
			carry=sum/10;
		}
		return c;
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
}
