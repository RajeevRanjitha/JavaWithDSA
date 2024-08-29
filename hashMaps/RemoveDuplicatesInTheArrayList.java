package hashMaps;
import java.util.ArrayList;
import java.util.HashMap;
public class RemoveDuplicatesInTheArrayList {
	public static void main(String args[]) 
	{
		ArrayList <Integer>arr=new ArrayList<Integer>();
		for(int i=0;i<7;i++) 
		{
			arr.add(i);
			arr.add(i+1);
			arr.add(i+2);
		}
		System.out.println("Before Removing Duplicates");
		for(int x:arr) 
		{
			System.out.print(x+" ");
		}
		arr=removeDuplicate(arr);
		System.out.println("After Removing Duplicates");
		for(int x:arr) 
		{
			System.out.print(x+" ");
		}
	}

	private static ArrayList<Integer> removeDuplicate(ArrayList<Integer> arr) {
		ArrayList<Integer>newArr=new ArrayList<>();
		HashMap<Integer,Boolean>boolObj=new HashMap<>();
		for(int i=0;i<arr.size();i++) 
		{
			if(!boolObj.containsKey(arr.get(i))) 
			{
				newArr.add(arr.get(i));
				boolObj.put(arr.get(i), true);
			}
		}
		return newArr;
	}

}
