package hashMapsHashMaps;
import java.util.HashMap;
import java.util.Scanner;
public class ExtractUniqueCharactersUsingHashMap {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		HashMap<Character,Integer>obj=new HashMap<>();
		for(int i=0;i<str.length();i++) 
		{
			obj.put(str.charAt(i), obj.getOrDefault(str.substring(i, i+1)+1, 1));
		}
		for(Character x: obj.keySet()) 
		{
			System.out.println(x+" ");
		}
	}
}

