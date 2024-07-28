package generics;

public class PairUse {
	public static void main(String args[]) 
	{
		Pair<String> obj=new Pair<String>("Ranjitha","Rajeev");
		
		obj.getB();
		obj.setA("Ranjitha");
		System.out.println(obj.getA());
		Pair<Integer> obj1=new Pair<Integer>(2,3);
		System.out.println(obj1.getA()+obj1.getB());
		
	}
}
