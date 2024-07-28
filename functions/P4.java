package functions;
import java.util.Scanner;
public class P4 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkPrime(n));
	}
	public static boolean checkPrime(int n) 
	{
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	
}
