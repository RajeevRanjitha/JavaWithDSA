package fundamentals;
class P4 {
	private int a=10;
	public void getA()
	{
		System.out.println(a);
	}
	public void setA() 
	{
		a=20;
	}
}
public class P3
{
	public static void main(String[] args) {
		P4 obj=new P4();
		obj.getA();
		obj.setA();
		obj.getA();
	}
}
