package generics;

public class Pair<T> {
	private T a;
	private T b;
	public  Pair(T a,T b) 
	{
		this.a=a;
		this.b=b;
	}
	public Pair() 
	{
		
	}
	public	T getA() 
	{
		return this.a;
	}
	public void setA(T a) 
	{
		this.a=a;
	}
	public void setB(T b) 
	{
		this.b=b;
	}
	public T getB() 
	{
		return this.b;
	}
}
