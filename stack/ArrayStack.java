package stack;
public class ArrayStack {
	private int a[];
	private int top;
	public ArrayStack() 
	{
		a=new int[5];
		top=-1;
	}
	public  void push(int val) throws StacKFullException
	{
		if(top==a.length-1) 
		{
			throw new StacKFullException("The Stack is full");
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
}