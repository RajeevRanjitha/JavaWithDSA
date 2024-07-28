package oops;

class B
{
	public  void show() 
	{
		System.out.println("I am in class B");
	}
}
class C extends B
{
	public void show() 
	{
		System.out.println("I am in class c");
	}
}
class D extends C
{
	public void show() 
	{
		System.out.println("I am in class D");
	}
}
public class A {
	public static void main(String args[]) 
	{
		B obj = new D(); 
		obj.show();
		obj=new C();
		obj.show();
	}
}
