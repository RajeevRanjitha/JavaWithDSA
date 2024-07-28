package InnerClass;

public class Anonymus {
	public void print() 
	{
		System.out.println("I am not an anonymus");
	}
	public static void main(String args[]) 
	{
		Anonymus obj=new Anonymus() {
			public void print1() 
			{
				System.out.print("hiii");
			}
		};
		obj.print();
	}
}
