package fundamentals;
import java.util.*;
public class P15 {
	public static void main(String[] args) {
		System.out.println();
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("hi");
		obj.add("Hello");
		obj.add("Ranjitha");
		obj.add("Gayatri");
		Collections.sort(obj,Collections.reverseOrder());
		for(String str:obj) 
		{
			System.out.println(str);
		}
		System.out.println(obj);
	}
}
