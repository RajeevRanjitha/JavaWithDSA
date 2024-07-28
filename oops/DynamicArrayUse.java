package oops;
public class DynamicArrayUse {
	public static void main(String args[]) 
	{
		DynamicArray obj=new DynamicArray();
		obj.remove();
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		for(int i=0;i<50;i++) 
		{
			obj.add(i+1);
		}
		System.out.println(obj.size());
		System.out.println();
		obj.remove();
		obj.set(51, 34);
		obj.set(0, 34);
		for(int i=0;i<obj.size();i++) 
		{
			System.out.print(obj.a[i]+" ");
		}
		System.out.println();
	}
}
