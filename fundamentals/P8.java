package fundamentals;
abstract class P9
{
	int a=9;
	public abstract void print();
	public void bark() 
	{
		System.out.println("bark");
	}
}
public class P8 extends P9 {
	int val=9;
	public static void main(String[] args) {
		System.out.println();
		P8 obj=new P8();
		System.out.println(obj.val);
		obj.print();
		obj.a=10;
		System.out.println(obj.a);
	}
	public void print() 
	{
		System.out.println("Hi I am From Abstract Method");	
	}
}
