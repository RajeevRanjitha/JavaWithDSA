package Queues;

public class ArrayQueue {
	private int a[];
	private int front;
	private int size;
	private int rear;
	public ArrayQueue() 
	{
		a=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	public ArrayQueue(int n) 
	{
		a=new int[n];
		front=-1;
		rear=-1;
		size=0;
	}
	public void enqueue(int val)  throws FulLException
	{
		if(rear==a.length) 
		{
			throw new FulLException();
		}
		if(size==0) 
		{
			a[++front]=val;
			a[++rear]=val;
		}
		else 
		{
			a[++rear]=val;
		}
		size++;
	}
	public int front() throws EmptyException 
	{
		if(size==0) 
		{
			throw new EmptyException();
		}
		return a[front];
	}
	public int dequeue() throws EmptyException 
	{
		if(size==0) 
		{
			throw new EmptyException();
		}
		if(front==rear) 
		{
			int temp=a[front];
			front=-1;
			rear=-1;
			return temp;
		}
		else 
		{
			int temp=a[front];
			front++;
			size--;
			return temp;
		}
		
		
	}
	public boolean isEmpty() 
	{
		return size==0;
	}
	public int size() 
	{
		return size;
	}
}
