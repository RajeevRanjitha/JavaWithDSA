package inheritence;

public class Shape {
	int sides;
	public Shape(int n) 
	{
		sides=n;
		if(n>=3 || n==0) 
		{
			System.out.println("The Polygon");
		}
		else 
		{
			System.out.println("Not a polygon");
		}
	}
	public void print() 
	{
		System.out.println("It is about printing the shapes of the classes");
	}
}
