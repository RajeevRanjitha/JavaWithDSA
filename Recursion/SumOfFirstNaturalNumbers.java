package Recursion;
import java.util.Scanner;
public class SumOfFirstNaturalNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		System.out.println(sum(n));
	}
	public static int sum(int n) 
	{
		if(n==1 || n==0) {
			return n;
		}
		int result=n+sum(n-1);
		return result;
	}
}
