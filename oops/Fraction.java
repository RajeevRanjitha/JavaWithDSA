package oops;
import java.util.Scanner;
public class Fraction {
	static Scanner sc=new Scanner(System.in);
	int numerator;
	int denominator;
	public void getNumeratorAndDenominator() 
	{
		System.out.println("The numerator is "+numerator);
		System.out.println("The denominator is "+denominator);
	}
	public Fraction(){
		numerator=sc.nextInt();
		denominator=sc.nextInt();
		simplify();
		print();
	}
	public void simplify() 
	{
		int gcd=1;
		int min=Math.min(numerator, denominator);
		int max=Math.max(numerator, denominator);
		while(min!=0) 
		{
			int r=max%min;
			max=min;
			min=r;
			gcd=max;
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		print();
	}
	public void increment() 
	{
		numerator=(numerator+denominator);
		simplify();
	}
	public void print() 
	{
		System.out.println(numerator+"/"+denominator);
	}
	public static void simplify(int numerator, int denominator) {
		int gcd=1;
		int min=Math.min(numerator, denominator);
		int max=Math.max(numerator, denominator);
		while(min!=0) 
		{
			int r=max%min;
			max=min;
			min=r;
			gcd=max;
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		print(numerator,denominator);
	}
	public static void print(int numerator,int denominator) 
	{
		System.out.println(numerator+"/"+denominator);
	}
}
