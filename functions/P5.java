package functions;
import java.util.Scanner;
public class P5 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int sf=sc.nextInt();
		int ef=sc.nextInt();
		int w=sc.nextInt();
		celcius(sf,ef,w);
	}
	public static void celcius(int s,int e,int w) 
	{
		for(int i=s;i<=e;i=i+w) 
		{
			int  c=((i-32)*5)/9;
			System.out.println("The Fahrenheit of "+i+ "is "+ c);
		}
	}
}
