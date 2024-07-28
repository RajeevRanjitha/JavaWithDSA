package inheritence;
import java.util.Scanner;
public class VehicleUse {
	public static void main(String args[]) 
	{
		Bicycle b1=new Bicycle();
		b1.color="red";
		b1.num_of_tires=2;
		Vehicle v1=new Vehicle();
		v1.setColor("Black");
		v1.print();
		b1.print();
		Car c1=new Car();
		c1.print();
		System.out.println();
		c1.num_of_tires=10;
		c1.print();
	}
}
