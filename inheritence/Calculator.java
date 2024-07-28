package inheritence;
import java.util.Scanner;
public class Calculator {
	static Scanner sc=new Scanner(System.in);
	int a;
	int b;
	public Calculator(int a,int b) 
	{
		this.a=a;
		this.b=b;
	}
	public void print() 
	{
		System.out.println(a+" "+b);
	}
}
