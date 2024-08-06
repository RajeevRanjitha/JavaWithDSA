package Queues;
public class CircularArrayQueue {
	private int a[];
	private int front;
	private int size;
	private int rear;
	public CircularArrayQueue() 
	{
		a=new int[3];
		front=-1;
		rear=-1;
		size=0;
	}
	public CircularArrayQueue(int n) 
	{
		a=new int[n];
		front=-1;
		rear=-1;
		size=0;
	}
	public void enqueue(int val)  throws FulLException
	{
		if(size==0) 
		{
			front=0;
			rear=0;
			a[front]=val;
		}
		else 
		{
			a[(rear+1)%a.length]=val;
			rear++;
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
			front=(front+1)%a.length;
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
