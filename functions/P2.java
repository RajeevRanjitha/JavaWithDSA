package functions;
import java.util.Scanner;
public class P2 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(sum(a,b));
		even(11,17);
	}
	public static int sum(int a,int b) 
	{
		return a+b;
	}
	public static void even(int start,int end) 
	{
		if(start%2!=0) 
		{
			start++;
		}
		for(int i=start;i<=end;i+=2) 
		{
			System.out.println(i);
		}
		return ;
	}
}
