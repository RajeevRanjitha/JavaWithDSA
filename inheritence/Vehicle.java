package inheritence;

public class Vehicle {
	private String color;
	public void setColor(String color) 
	{
		this.color=color;
	}
	public String getColor() 
	{
		return this.color;
	}
	int num_of_tires;
	int sped;
	public void print() 
	{
		System.out.println("color"+color+"spedd"+sped);
	}
}
