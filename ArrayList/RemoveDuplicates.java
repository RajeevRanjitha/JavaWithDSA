package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicates {
	public static void main(String args[]) 
	{
		System.out.println("Enter the Capacity of the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>obj=new ArrayList<Integer>(n);
		System.out.println("Enter the Elements of the aray");
		for(int i=0;i<n;i++) 
		{
			int m=sc.nextInt();
			obj.add(m);
		}
		System.out.println("The array elements without creating the new array is ie., Modification in the original array is ");
		removeConsecutive(obj);
		for(int i=0;i<obj.size();i++) 
		{
			System.out.println(obj.get(i));
		}
		System.out.println();
		ArrayList<Integer> obj1= removeConsecutive1(obj);
		for(int i=0;i<obj1.size();i++) 
		{
			System.out.println(obj1.get(i));
		}
		System.out.println();
		System.out.println("Removing Duplicates in the array");
		ArrayList<Integer>obj2=removeDuplicates(obj);
		System.out.println();
		for(int i=0;i<obj2.size();i++) 
		{
			System.out.println(obj2.get(i));
		}
	}
	public static ArrayList<Integer> removeConsecutive1(ArrayList<Integer> obj)
	{
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(obj.get(0));
		for(int i=1;i<obj.size();i++) 
		{
			if(obj.get(i-1)==obj.get(i)) 
			{
				continue;
			}
			else 
			{
				obj1.add(obj.get(i));
			}
		}
		return obj1;
	}
	public static  void removeConsecutive(ArrayList<Integer>obj) 
	{
		for(int i=0;i<obj.size()-1;i++) 
		{
			if(obj.get(i)==obj.get(i+1)) 
			{
				obj.remove(i);
				i--;
			}
		}
		
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> obj) 
	{
		ArrayList<Integer>obj1=new ArrayList<Integer>();
		for(int i=0;i<obj.size();i++) 
		{
			if(!(obj1.contains(obj.get(i)))) 
			{
				System.out.println("The element added is "+obj.get(i));
				obj1.add(obj.get(i));
			}
		}
		return obj1;
	}
				
}
