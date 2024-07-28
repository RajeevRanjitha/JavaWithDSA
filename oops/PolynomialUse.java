package oops;

public class PolynomialUse {
	public static void main(String args[]) 
	{
		Polynomial obj=new Polynomial();
		obj.setCoefficient(0, 7);
		obj.setCoefficient(4, 9);
		obj.setCoefficient(7, 6);
		obj.setCoefficient(3, 8);
		obj.print();
		System.out.println(obj.getCoeff(3));
		Polynomial obj2=new Polynomial();
		obj2.setCoefficient(3, 4);
		obj2.setCoefficient(9, 5);
		obj2.setCoefficient(2, 3);
		obj2.setCoefficient(5, 8);
		obj2.print();
		Polynomial obj3=obj.add(obj2);
		obj3.print();
		Polynomial obj4=new Polynomial();
		obj4=obj.subtract(obj2);
		obj4.print();
		Polynomial obj5=obj.multiply(obj2);
		obj5.print();
	}
}

