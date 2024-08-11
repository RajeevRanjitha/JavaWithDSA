package Queues;
import linkedlist.Node;
public class Dequeue<T> {
	private Node<T>front,rear;
	private int size;
	public Dequeue()
	{
		front=null;
		rear=null;
	}
	public void insertFront(T val) 
	{
		Node<T>node=new Node<>(val);
		if(this.front==null || this.rear==null) 
		{
			front=rear=node;
		}
		else 
		{
			node.next=front;
			front=node;
		}
		size++;
	}
	public T deletefront() throws EmptyException 
	{
		if(size==0) 
		{
			throw new EmptyException();
		}
		if(front==rear) 
		{
			T temp=front.val;
			this.front=null;
			this.rear=null;
			size--;
			return temp;
		}
		else 
		{
			T temp=front.val;
			front=front.next;
			size--;
			return temp;
		}
	}
	public void insertRear(T val) 
	{
		Node<T>node=new Node<>(val);
		if(this.front==null || this.rear==null) 
		{
			front=rear=node;
		}
		else 
		{
			rear.next=node;
			rear=node;
		}
		size++;
	}
	public T deleterear() throws EmptyException 
	{
		T temp;
		if(size==0) 
		{
			throw new EmptyException();
		}
		Node<T>p=this.front;
		if(front==rear) 
		{
			temp=rear.val;
			front=null;
			rear=null;
			size--;
			return temp;
		}
		else 
		{
			while(p.next.next!=null) 
			{
				p=p.next;
			}
			temp=p.next.val;
			p.next=null;
			rear=p;
			size--;
			return temp;
		}
	}
	public void print() {
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
	}
	public boolean isEmpty() 
	{
		return size==0;
	}
	public int size() 
	{
		return size;
	}
	public T front() throws EmptyException 
	{
		if(size==0) 
		{
			throw new EmptyException();
		}
		return front.val;
	}
	public T rear() throws EmptyException 
	{
		if(size==0) 
		{
			throw new EmptyException();
		}
		return rear.val;
	}
}
