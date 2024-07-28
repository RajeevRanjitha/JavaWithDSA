package InnerClass;
public class Innerclass {
	int a=10;
	public void print() 
	{
		System.out.println("I am the Outer class");
	}
	public  class Innerclass1
	{
		int a=10;
		public static void print() 
		{
			System.out.println("I am from inner class");
		}
	}
}
