package inheritence;

public class Subtract extends Calculator{
	public Subtract(int a,int b) 
	{
		super(a,b);
	}
	public int  subtract() 
	{
		return a-b;
	}
}
