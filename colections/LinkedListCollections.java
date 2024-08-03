package colections;
import java.util.Scanner;
import java.util.LinkedList;
public class LinkedListCollections {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(45);
		obj.add(75);
		LinkedList<Integer>obj1=new LinkedList<>();
		obj1.add(45);
		obj1.add(75);
		obj1.add(90);
		System.out.println();
		System.out.println(obj1.containsAll(obj));
		print(obj);
		System.out.println();
		print(obj1);
		obj1.addAll(obj);
		print(obj1);
	//	obj1.removeAll(obj);
		obj1.retainAll(obj);
		print(obj1);
		
		
	}
	public static void print(LinkedList<Integer> obj) 
	{
		for(int i=0;i<obj.size();i++) 
		{
			System.out.print(obj.get(i)+" ");
		}
		System.out.println();
	}
	
}
