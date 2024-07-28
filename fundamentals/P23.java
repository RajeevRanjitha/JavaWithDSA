package fundamentals;
import java.util.Scanner;
public class P23 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=true;
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
				b=false;
				break;
			}
		}
		if(b) 
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(b);
		}
	}
}
