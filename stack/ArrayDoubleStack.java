package stack;
public class ArrayDoubleStack {
	private int a[];
	private int top;
	public ArrayDoubleStack() 
	{
		a=new int[2];
		top=-1;
	}
	public  void push(int val)
	{
		if(top==a.length-1) 
		{
			int b[]=new int[a.length*2];
			for(int i=0;i<a.length;i++) 
			{
				b[i]=a[i];
			}
			a=b;
		}
		a[++top]=val;
	}
	public  int pop() throws  StackEmptyException
	{
		if(top==-1) 
		{
			throw new StackEmptyException();
		}
		int temp=a[top];
		top--;
		return temp;
	}
	public  int top_() throws StackEmptyException 
	{
		if(top==-1) 
		{
			throw new StackEmptyException("The Stack Is Empty");
		}
		return a[top];
	}
	public  boolean isEmpty() 
	{
		return top==-1;
	}
	public  int size() 
	{
		return top+1;
	}
	public void print() 
	{
		int top=this.top;
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[top]);
			top--;
		}
	}
}