package fundamentals;
import java.util.Scanner;
public class P20 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pow=sc.nextInt();
		int m=1;
		for(int i=1;i<=pow;i++) 
		{
			m*=n;
		}
		System.out.println(m);
	}
}
