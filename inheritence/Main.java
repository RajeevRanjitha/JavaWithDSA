package inheritence;
import java.util.Scanner;
class P1 {
	static Scanner sc=new Scanner(System.in);
	int a;
	int b;
	public P1(int a,int b) 
	{
		this.a=a;
		this.b=b;
	}
}
class P2 extends P1
{
	int c;
	public P2(int a,int b,int c) 
	{
		super(a,b);
		this.c=this.a+this.b;
	}
}
class P3 extends P2
{
	public P3(int a,int b,int c)
	{
		super(a,b,c);
	}
}
public class Main
{
	public static void main(String args[]) 
	{
		P3 obj1;
		P3 obj=new P3(1,2,4);
		System.out.print(obj.a+" ");
		System.out.print(obj.b+" ");
		System.out.println(obj.c+" ");
	}
}
