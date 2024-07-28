package linkedlist;
import java.util.Scanner;
public class LinkedListUse {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Node<Integer> head=createLinkedList();
		print(head);
		System.out.println();
		System.out.println("The length of the linked list is"+length(head));
		System.out.println("Printing the ith Node data");
		printithNode(head,length(head));
		head=insert(head,length(head));
		System.out.println();
		print(head);
		head=delete(head,length(head));
		System.out.println();
		print(head);
		System.out.println();
		System.out.println(search(head));
		head=appendLast(head,length(head));
		System.out.println();
		print(head);
		head=reverse(head);
		System.out.println();
		print(head);
	}
	public static Node<Integer> createLinkedList() 
	{
		Node<Integer>head;
		System.out.println("Enter the value of the node");
		int n=sc.nextInt();
		Node<Integer> node1=new Node<Integer>(n);
		head=node1;
		Node<Integer> tail=head;
		while(true) 
		{
			System.out.println("Do you want to add more Nodes enter y or n");
			String str=sc.next();
			if(str.equals("y"))
			{
				System.out.println("Enter the value of the node");
				n=sc.nextInt();
				Node<Integer> node=new Node<Integer>(n);
				tail.next=node;
				tail=node;
			}
			else 
			{
				break;
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
	public static int length(Node<Integer> p) 
	{
		int count =0;
		while(p!=null) 
		{
			count++;
			p=p.next;
		}
		return count;
	}
	
	public static void printithNode(Node<Integer>p,int length) 
	{
		System.out.println("Enter the index of the node");
		int n=sc.nextInt();
		if(n>length) 
		{
			return;
		}
		else 
		{
			for(int i=0;i<=n;i++) 
			{
				if(p==null) 
				{
					break;
				}
				if(i==n) 
				{
					System.out.println("The value at the position "+n+"is "+p.val);
					break;
				}
				p=p.next;
			}
		}
	}
	public static Node<Integer> insert(Node<Integer>head,int length) 
	{
		Node<Integer>p=head;
		System.out.println("Enter the position where you want to insert");
		int n=sc.nextInt();
		if(n==0) 
		{
			System.out.println("Enter the value you want to inert");
			int val=sc.nextInt();
			Node<Integer>node=new Node<Integer>(val);
			node.next=p;
			head=node;
			return head;
		}
		if(n>length)
		{
			return head;
		}
		for(int i=0;i<n-1;i++) 
		{
			p=p.next;
		}
		System.out.println("Enter the value you want to inert");
		int val=sc.nextInt();
		Node<Integer>node=new Node<Integer>(val);
		node.next=p.next;
		p.next=node;
		return head;
	}
	public static Node<Integer> delete(Node<Integer>head,int length)
	{
		Node<Integer>p=head;
		System.out.println("Enter the position where you want to delete");
		int n=sc.nextInt();
		if(n>=length) 
		{
			return head;
		}
		if(n==0) 
		{
			Node<Integer>temp=head;
			head=head.next;
			temp.next=null;
			return head;
		}
		else 
		{
			for(int i=0;i<n-1;i++) 
			{
				p=p.next;
			}
			Node<Integer>temp=p.next;
			p.next=p.next.next;
			temp.next=null;
		}
		return head;
	}
	public static int  search(Node<Integer>head) 
	{
		System.out.println("Enter the Number you want to search");
		int n=sc.nextInt();
		Node<Integer>p=head;
		int count=0;
		while(p!=null) 
		{
			if(p.val==n) 
			{
				System.out.println("The element"+n+"is found at the index"+count);
				return count;
			}
			count++;
			p=p.next;
		}
		return -1;
	}
	public static Node<Integer> appendLast(Node<Integer>head,int length) 
	{
		Node<Integer>p=head,temp;
		System.out.println("Enter the number of last nodes you want to append at the fornt");
		int n=sc.nextInt();
		temp=head;
		int i=0;
		while(i<length-n-1) 
		{
			p=p.next;
			i++;
		}
		head=p.next;
		p.next=null;
		p=head;
		while(p.next!=null)
		{
			p=p.next;
		}
		p.next=temp;
		return head;
	}
	public static Node<Integer> reverse(Node<Integer>head)
	{
		Node<Integer>current,prev,next,tail;
		current=head;
		tail=head;
		prev=null;
		next=null;
		while(current!=null) 
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
}
