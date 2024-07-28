package inheritence;

public class Circle extends Shape{
	int r;
	int sides;
	public Circle(int n,int r)
	{
		super(n);
		sides=n;
		this.r=r;
	}
	public void print() 
	{
		System.out.println("The area of the circle is "+2*22/7*r);
	}
}
