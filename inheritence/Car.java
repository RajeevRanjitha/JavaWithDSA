package inheritence;

public class Car extends Vehicle{
	int no_of_doors;
	public void print() 
	{
		System.out.print(this.no_of_doors+""+this.num_of_tires+""+this.getColor());
	}

}