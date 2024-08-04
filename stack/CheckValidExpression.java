package stack;
import linkedlist.Node;
import java.util.Scanner;
public class CheckValidExpression<T> {
	static Scanner sc=new Scanner(System.in);
	private Node<T> top;
	private int size=0;
	public CheckValidExpression()
	{
		top=null;
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
	public T pop() 
	{
		T temp=top.val;
		top=top.next;
		size--;
		return temp;
	}
	public T peek() 
	{
		return top.val;
	}
	public boolean isEmpty() 
	{
		return top==null;
	}
	public int size_() 
	{
		return size;
	}
}
