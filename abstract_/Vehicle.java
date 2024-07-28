package abstract_;

public abstract class Vehicle {
	int n;
	public Vehicle(int n) 
	{
		this.n=100;
	}
	public abstract void noOftires();
	public abstract int noOfgears();
	public void print() 
	{
		System.out.println("I am a vehicle");
	}
}
