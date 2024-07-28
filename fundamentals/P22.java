package fundamentals;
import java.util.Scanner;
public class P22 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a);
		for(int i=1;i<n;i++) 
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println(c);
	}
}
