package fundamentals;
import java.util.*;
class P14
{
	public static void main(String args[]) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Rnajitha");
		obj.add("Gayatri");
		obj.add(0,"Duppatla");
		obj.remove(2);
		obj.add(2, "hi");
		obj.set(2, "Gayatri");
		for(String str:obj) 
		{
			System.out.println(str);
		}
		System.out.println(obj.size());
		System.out.println(obj.get(0));
		Collections.sort(obj);
		for(String str:obj) 
		{
			System.out.println(str);
		}
	}
}