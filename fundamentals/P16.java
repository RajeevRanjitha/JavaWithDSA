package fundamentals;
import java.util.*;
public class P16 {
	public static void main(String args[]) 
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("Duppatla","Ranjitha");
		obj.put("Hi","Hello");
		obj.put("Gayatr","Ranjitha");
		System.out.println(obj.get("Hi"));
		System.out.println();
		for(String str:obj.values()) 
		{
			System.out.println(str);
		}
		System.out.println();
		for(String str:obj.keySet()) 
		{
			System.out.println(obj.get(str));
		}
		System.out.println(obj);
	}
}
