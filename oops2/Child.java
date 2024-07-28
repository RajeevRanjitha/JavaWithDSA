package oops2;
import java.util.Scanner;
public class Child extends Parent{
	String str3;
	static Scanner sc=new Scanner(System.in);
	public Child() 
	{
		this.str3="Ranjtiha";
			System.out.println("Hi I am from children clas");
	}
	public Child(String str1,String str2,String str3,String str4) 
	{
		super(str1,str2);
		str3=sc.next();
		str4=sc.next();
	}
	public static void main(String args[]) 
	{
		Parent p1=new Parent();
		System.out.println(p1.str3);
		Child c1=new Child();
		System.out.println(c1.str3);
	}
}
