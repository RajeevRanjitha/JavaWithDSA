package hashMaps;

public class HashMapUse {
	public static void main(String args[]) throws HashMapEmptyException 
	{
		HashMapCreation<String , Integer>obj=new HashMapCreation<>();
		obj.insert("Ranjitha", 94);
		obj.insert("Rajeev", 100);
		obj.insert("Amma", 100);
		obj.insert("Nanna", 100);
		obj.insert("Santosh", 0);
		obj.delete("Santosh");
	}
}
