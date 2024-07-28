package interfaces;

public class FunctionalInterFaceUse
{
	public static void main(String args[]) 
	{
		FunctionalInterFace obj= (a,b)-> 
		{System.out.println(a+b);
		System.out.println("Hello How are you");
		};
		obj.sum(4, 6);
	}
}
