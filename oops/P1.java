package oops;
import java.util.Scanner;
public class P1 {
	String name;
	final boolean val;
	static int val1=10;
	static int m;
	static final int value=10;
	public P1() 
	{
		this(7,8);
		System.out.println(val);
	}
	public P1(int a,int b) 
	{
		val=false;
	}
	private int rollno;
	public void setRoll(int rollno) 
	{
		System.out.println(this);
		this.rollno=rollno;
	}
	public int  getRoll() 
	{
		 System.out.println(this.rollno);
		 return this.rollno;
	}
	public static void main(String args[]) 
	{
		P1 obj=new P1();
		System.out.println(obj.val);
		obj.val1=15;
		System.out.println(obj.val1);
		System.out.println(P1.val1);
	}
}
