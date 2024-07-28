package exceptions;
import java.util.Scanner;
public class Divide {
	public static void main(String args[])throws NumberCantBeNegativeException,DivideByZeroExcaption
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		divide(1,0);
		fact(n);
		
	}
	public static int  divide(int a,int b) throws DivideByZeroExcaption
	{
		if(b!=0) 
		{
			return a/b;
		}
		else 
		{
			throw new DivideByZeroExcaption();
		}
	}
	public static int fact(int n) throws NumberCantBeNegativeException
	{
		if(n<0) 
		{
			throw new NumberCantBeNegativeException();
		}
		return 1;
	}
}
