package exceptions;
import java.util.Scanner;
public class P3 {
	int n;
	int m;
	Scanner sc=new Scanner(System.in);
	P3(int m)
	{
		n=sc.nextInt();
		this.m=m;
	}
	public static void main(String args[]) 
	{
		P3 obj=new P3(10);
		try{
			check(obj);
			}
		catch(Exception e) 
		{
			
		}
		finally 
		{
			System.out.print("tak completed");
		}
	}
	private static void check(P3 obj) throws NotEqualException {
		if(obj.m!=5) 
		{
			throw new NotEqualException("Hi You are WasteFellow ... you are a Failure");	
		}
		
	}
}
