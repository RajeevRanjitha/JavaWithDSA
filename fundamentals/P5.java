package fundamentals;

class P6 {
	public static void main(String[] args) {
		System.out.println("Ranjitha Gayatri");
	}
	protected void print_() 
	{
		System.out.println("Iam a Protected Method");
	}
	private void write() 
	{
		System.out.println("I am a Write Method");
	}
	public void getWrite() 
	{
		write();
	}
}
public class P5 extends P6
{
	public static void main(String[] args) {
		System.out.println("Hi... I am Sub class");
		P6 obj=new P6();
		obj.print_();
		obj.getWrite();
	}
}

