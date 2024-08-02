package linkedlist;
import java.util.Scanner;
public class LinkedListRetainAndDelete {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Node<Integer>head=create();
		System.out.println("Enter the number of Nodes you want to retain");
		int m=sc.nextInt();
		System.out.println("Enter the number of nodes you want to delete");
		int n=sc.nextInt();
		head=linkedListRetainAndDelete(head,m,n);
		print(head);
	}
	public static Node<Integer> create()
	{
		System.out.println("Enter the number of Elements that you want to create for LinkedList");
		int n=sc.nextInt();
		Node<Integer>head=null,tail=null;
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++) 
		{
			int val=sc.nextInt();
			Node<Integer>node=new Node<Integer>(val);
			if(i==0) 
			{
				head=node;
				tail=node;
			}
			else 
			{
				tail.next=node;
				tail=node;
			}
		}
		return head;
	}
	public static void print(Node<Integer> p) 
	{
		while(p!=null) 
		{
			System.out.print(p.val+" ");
			p=p.next;
		}
	}
	public static Node<Integer> linkedListRetainAndDelete(Node<Integer>head,int m,int n) 
	{
		if(m==0) 
		{
			return null;
		}
		if(n==0) 
		{
			return head;
		}
		Node<Integer>p=head;
		while(p!=null) 
		{
			 int x=m;
			 int y=n;
			while(p.next!=null && x>1) 
			{
				p=p.next;
				x--;
			}
			Node<Integer>q=p.next;
			while(q.next!=null && y>1) 
			{
				q=q.next;
				y--;
			}
			p.next=q.next;
			p=q.next;
		}
		return head;	
	}
}
