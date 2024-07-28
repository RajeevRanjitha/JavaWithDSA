package inheritence;

public class Rectangle extends Shape {
	int length;
	int breadth;
	public Rectangle(int n,int l,int b) 
	{
		super(n);
		sides=n;
		this.length=l;
		this.breadth=b;
	}
	public void print() 
	{
		System.out.println("Thes area of the rectangle is"+ this.length*this.breadth);
	}
}
