package linkedlist;
import java.util.Scanner;
public class Mergin2SortedLinkedList {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Creation of Linked List1");
		Node<Integer>head1=create();
		print(head1);
		Node<Integer>head2=create();
		System.out.println("Creation of LinkedList2");
		print(head2);
		print(merge(head1,head2));
	}
	public static Node<Integer> create()
	{
		System.out.println("Enter the number of nodes you want to create");
		int n=sc.nextInt();
		System.out.println("Enter the node values");
		Node<Integer>head=null,tail=null;
		for(int i=0;i<n;i++) 
		{
			int x=sc.nextInt();
			Node<Integer>node=new Node<Integer>(x);
			if(i==0) 
			{
				head=node;
				tail=node;
			}
			else {
				tail.next=node;
				tail=node;
			}
			
		}
		return head;
	}
	public static void print(Node<Integer>head) 
	{
		Node<Integer>p=head;
		while(p!=null) 
		{
			System.out.print(p.val+" ");
			p=p.next;
		}
		System.out.println();
	}
	public static Node<Integer> merge(Node<Integer>head1,Node<Integer>head2) 
	{
		Node<Integer>p=head1,q=head2,head=null,tail=null;
		while(p!=null && q!=null) 
		{
			if(p.val<q.val) 
			{
				if(head==null) 
				{
					head=p;
					tail=p;
				}
				else 
				{
					tail.next=p;
					tail=p;
				}
				p=p.next;
			}
			else 
			{
				if(head==null) 
				{
					head=q;
					tail=q;
				}
				else 
				{
					tail.next=q;
					tail=q;
				}
				q=q.next;
			}
		}
		while(p!=null) 
		{
			tail.next=p;
			tail=p;
			p=p.next;
		}
		while(q!=null) 
		{
			tail.next=q;
			tail=q;
			q=q.next;
		}
		return head;
	}
}
