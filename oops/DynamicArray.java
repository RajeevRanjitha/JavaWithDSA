package oops;
import java.util.Scanner;
public class DynamicArray {
	static Scanner sc=new Scanner(System.in);
	int a[];
	int pointer;
	DynamicArray()
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		a=new int[n];
		pointer=-1;
	}
	public int size() 
	{
		return pointer+1;
	}
	public int getinput(int index) 
	{
		if(index>pointer) 
		{
			throw new ArrayIndexOutOfBoundsException("Enter the valid index");
		}
		return a[index];
	}
	public void add(int n) 
	{
		if(this.pointer>=this.a.length-1) 
		{
			int b[]=new int[2*this.a.length];
			for(int i=0;i<this.a.length;i++) 
			{
				b[i]=this.a[i];
			}
			this.a=b;
		}
			this.a[++pointer]=n;
	}
	public void remove() 
	{
		if(pointer==-1) 
		{
			System.out.print("The array is Empty");
		}
		else 
		{
			int temp=a[pointer];
			this.pointer--;
			System.out.println("The Element removed is"+temp);
			System.out.println("Now the element contains "+ size());
		}
	}
	public boolean isEmpty() 
	{
		if(pointer==-1) {
		return true;	
		}
		else 
		{
			return false;
		}
	}
	public void set(int index, int element) 
	{
		if(index<=pointer) 
		{
			this.a[index]=element;
		}
		else 
		{
			return;
		}
	}
}
