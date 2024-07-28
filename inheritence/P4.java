package inheritence;

class P5
{
public void show1 () 
{
	System.out.println("show1");
}	
}
class P6 extends P5{
	public static void show2() 
	{
		System.out.println("Show 2");	
	}
}
public class P4 {
	public static void main(String args[]) 
	{
		P5  obj=new P6();
		obj.show1();
		P6 obj1=(P6)obj;
		obj1.show2();
	}
}
