package functions;
import java.util.Scanner;
public class P6 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element you want to search in the Sequence");
		int n=sc.nextInt();
		int m=Integer.MAX_VALUE;
		System.out.println(fab(m,n));
	}
	public static boolean fab(int m,int n) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting element of the Sequence");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd starting element of the Sequence");
		int b=sc.nextInt();
		if(a==n || b==n) 
		{
			return true;
		}
		int c=0;
		for(int i=0;i<m;i++) 
		{
			c=a+b;
			if(c==n) 
			{
				return true;
			}
			a=b;
			b=c;
		}
		return false;
	}
}
