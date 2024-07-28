package fundamentals;
import java.util.Scanner;
public class P25 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++) 
		{
			if(i*i>n) 
			{
				System.out.println("The square root of the number is "+(i-1));
				break;
			}
		}
	}
}
