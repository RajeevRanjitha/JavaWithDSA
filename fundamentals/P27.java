package fundamentals;
import java.util.Scanner;
public class P27 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number where you want the nth Element");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<n-1;i++) {
			int c=a+b;	
			System.out.println(c);		
			a=b;
			b=c;
		}
	}
}
