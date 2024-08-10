package Queues;
import linkedlist.Node;
public class QueueUsingLinkedList<T>{
	Node<T> front,rear;
	int size;
	public QueueUsingLinkedList()
	{
		front=null;
		rear=null;
		size=0;
	}
	public void enque(T val) 
	{
		Node<T> node=new Node<T>(val);
		if(size==0) 
		{
			front=node;
			rear=node;
		}
		else 
		{
			rear.next=node;
			rear=node;
		}
		size++;
	}
	public T  deque() throws EmptyException 
	{
		T val= front.val;
		if(size==0) 
		{
			throw new EmptyException();
		}
		if(front==rear) 
		{
			front=null;
			rear=null;
			return val;
		}
		else 
		{
			front=front.next;
		}
		size--;
		return val;
	}
	public T front() throws EmptyException 
	{
		if(size==0) 
		{
			throw new EmptyException();
		}
		return front.val;
	}
	public int size() 
	{
		return size;
	}
	public boolean isEmpty() 
	{
		return size==0;
	}
	
}
