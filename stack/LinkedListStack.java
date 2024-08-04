package stack;
import linkedlist.Node;
public class LinkedListStack<T>{
	private Node<T>top;
	private int size;
	public LinkedListStack()
	{
		top=null;
		size=0;
	}
	public void push(T a) 
	{
		Node<T>node=new Node<T>(a);
		if(top==null) 
		{
			top=node;
		}
		else 
		{
			node.next=top;
			top=node;
		}
		size++;
	}
	public T pop() throws EmptYException
	{
		if(top==null) 
		{
			throw new EmptYException();
		}
		T temp=top.val;
		top=top.next;
		size--;
		return temp;
	}
	public T top_() throws EmptYException
	{
		if(top==null) 
		{
			throw new EmptYException();
		}
		T temp=top.val;
		return temp;
	}
	public int size() 
	{
		return size;
	}
	public boolean isEmpty() 
	{
		return size==0;
	}
	public void print() 
	{
		Node<T>p=top;
		while(p!=null) 
		{
			System.out.println(p.val);
			p=p.next;
		}
	}
}
