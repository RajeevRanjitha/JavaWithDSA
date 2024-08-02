package colections;
import java.util.Scanner;
import java.util.LinkedList;
public class LinkedListCollections {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		LinkedList<Integer>obj=new LinkedList<>();
		System.out.println(obj.add(14));
		obj.add(5);
		obj.add(10);
		obj.add(200);
		obj.add(2,100);
		obj.add(3,100);
		obj.addFirst(100);
		System.out.println("The elements added are");
		print(obj);
		System.out.println("removing");
		obj.remove();
		LinkedList<Integer>obj2=new LinkedList<>();
		obj2.add(100);
		obj2.retainAll(obj);
		System.out.println("After retaing the elemetns in the object 2 is ");
		print(obj2);
		System.out.println(obj.remove());
		obj.retainAll(obj2);
		obj.containsAll(obj2);
		obj.addAll(0, obj2);
		obj.indexOf(34);
		obj.add(45);
		print(obj);
		print(obj2);
		System.out.println();
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
