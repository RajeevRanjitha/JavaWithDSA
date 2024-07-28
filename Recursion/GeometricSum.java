package Recursion;
import java.util.Scanner;
public class GeometricSum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		System.out.println(sum(n));
	}
	public static double sum(int n) 
	{
		if(n<0) 
		{
			return 0;
		}
		return sum(n-1)+1/Math.pow(2, n);
	}
}
