package oops;

public class FractionUse {

	public static void main(String args[]) 
	{
		Fraction obj=new Fraction();
		obj.getNumeratorAndDenominator();
		Fraction obj2=new Fraction();
		obj2.getNumeratorAndDenominator();
		sum(obj,obj2);	
	}
	public static void sum(Fraction obj1,Fraction obj2) 
	{
		int numerator=obj1.numerator*obj2.denominator+obj1.denominator*obj2.numerator;
		int denominator=obj1.denominator*obj2.denominator;
		Fraction.simplify(numerator,denominator);
	}
}
