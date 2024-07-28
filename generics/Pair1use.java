package generics;

public class Pair1use {
	public static void main(String args[]) 
	{
		Pair1<String,Integer> obj=new Pair1<>();
		Pair1<String,Integer> obj2=new Pair1<>();
		obj.setC1("Ranjitha");
		Pair1<Pair1<String ,Integer>,String> obj1=new Pair1<>();
		obj1.setC1(obj);
		obj.setC1("Rajeev");
		obj.SetC2(98);
		System.out.println(obj1.getC1().getC1());
	}	
}