package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class InitialisationOfArray {
	public static void main(String args[]) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>(10);
		System.out.println(obj.size());
		obj.add(7);
		obj.add(5);
		obj.add(1,5);
		obj.add(7);
		obj.add(5);
		obj.add(34);
		obj.add(2,36);
		System.out.println(obj.size());
		System.out.println("The Elements in the array is ");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		obj.set(1, null);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		Integer i=34;
		obj.remove(i);
		obj.remove(0);
		System.out.println();
		for(int j=0;j<obj.size();j++)
		{
			System.out.println(obj.get(j));
		}
	}
}
