package fundamentals;
import java.util.Scanner;
public class P24 {
	public static void main(String argp[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min= a>b?b:a;
		int max=a+b-min;
		while(min!=0) 
		{
			int r=max%min;
			max=min;
			min=r;
		}
		System.out.println(max);
	}
}
