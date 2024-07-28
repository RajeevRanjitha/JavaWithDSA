package fundamentals;
interface P12
{
	int a=9;
	public void print();
}
interface P13
{
	int b=10;
	public void print();
}
public class P11 implements P12,P13 {
	int val=9;
	public static void main(String[] args) {
		System.out.println();
		P11 obj=new P11();
		System.out.println(obj.val);
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	public void print() 
	{
		System.out.println("Hi I am From Abstract Method");	
	}
}
