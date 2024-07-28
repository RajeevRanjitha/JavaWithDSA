package functions;
import java.util.Scanner;
public class P1 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		System.out.println(ncr(n,r));
	}
	public static int fact(int n) 
	{
		int N=1;
		for(int i=1;i<=n;i++) 
		{
			N*=i;
		}
		return N;
	}
	public static int ncr(int n,int r) 
	{
		int N=fact(n);
		System.out.println("The Factorial of the given number is "+n+" "+N);
		int R=fact(r);
		System.out.println("The Factorial of the given number is "+r+" "+R);
		int NR=fact(n-r);
		System.out.println("The Factorial of n-r is "+" "+NR);
		return N/(R*NR);
	}
}
