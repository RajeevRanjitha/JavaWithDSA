package InnerClass;
public class InnerClassInSameClass {
	int n=9;
	class inner
	{
		void display() 
		{
			System.out.println(n);
		}
	}
	public void createinner() 
	{
		inner obj=new inner();
		obj.display();
	}
	public static void main(String args[]) 
	{
		InnerClassInSameClass obj=new InnerClassInSameClass();
		obj.createinner();
	}
}
