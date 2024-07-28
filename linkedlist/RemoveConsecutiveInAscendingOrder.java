package linkedlist;
import java.util.Scanner;
public class RemoveConsecutiveInAscendingOrder {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Node<Integer>head=create();
		print(head);
		removeConsecutive(head);
		System.out.println();
		print(head);	
	}
	public static Node<Integer> create()
	{
		System.out.println("Enter the number of Elements that you want to create for LinkedList");
		int n=sc.nextInt();
		Node<Integer>head=null,tail=null;
		System.out.println("Enter the elements in the Ascending Order");
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the value");
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
	public static void removeConsecutive(Node<Integer>head) 
	{
		Node<Integer>p=head;
		while(p.next!=null) 
		{
			if(p.val==p.next.val) 
			{
				Node<Integer>temp=p.next;
				p.next=p.next.next;
				temp.next=null;
			}
			else 
			{
				p=p.next;
			}
		}
	}
}