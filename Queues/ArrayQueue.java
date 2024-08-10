package Queues;

public class ArrayQueue {
	private int a[];
	private int front;
	private int size;
	private int rear;
	public ArrayQueue() 
	{
		a=new int[3];
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
			dynamicQueue();
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
	public void dynamicQueue() 
	{
		int b[]=new int[2*a.length];
		if((rear+1)%a.length==0) 
		{
			int k=0;
			for(int i=front;i<a.length;i++) 
			{
				b[k]=a[i];
				k++;
			}
			for(int i=0;i<front;i++) 
			{
				b[k]=a[i];
				k++;
			}
		}
		a=b;
	}
}
