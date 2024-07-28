package abstract_;

public class Car extends Vehicle {
	
	int n;
	
	Car(int n)
	{
		super(10);
		this.n=n;
	}
	@Override
	public void noOftires() {
		super.n=4;
		System.out.println(super.n);
	}
	public void print() 
	{
		System.out.println(this.n);
	}
	@Override
	public int noOfgears() {
		return 1;
	}
	
}
