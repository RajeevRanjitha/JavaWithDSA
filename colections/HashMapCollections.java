package colections;
import java.util.HashMap;
public class HashMapCollections {
	public static void main(String args[]) 
	{
		HashMap<String,Integer>obj=new HashMap<>();
		obj.put("Ranjitha", 90);
		obj.put("Rajeev", 99);
		obj.put("Sridevi", 100);
		obj.put("Viswanatham", 100);
		if(obj.containsKey("ranjitha")) {
			 int val= obj.get("ranjtiha");	
		}
	}
}
