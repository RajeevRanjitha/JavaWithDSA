package functions;
import java.util.Scanner;
public class P3 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(div(a,b));
	}
	public static int div(int a,int b) 
	{
		try {
			return a/b;
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmetic Exception");
			System.out.println(Integer.MAX_VALUE);
		}
		return 0;
	}
}
