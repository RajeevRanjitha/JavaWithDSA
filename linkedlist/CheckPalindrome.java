package linkedlist;
import java.util.Scanner;
public class CheckPalindrome {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Node<Integer>head=create();
		print(head);
		checkPalindrome(head);
	}
	public static Node<Integer> create()
	{
		System.out.println("Enter the number of Elements that you want to create for LinkedList");
		int n=sc.nextInt();
		Node<Integer>head=null,tail=null;
		System.out.println("Enter the elements");
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
	public static void checkPalindrome(Node<Integer>head) 
	{
		Node<Integer>slow=head,fast=head,p=head,q;
		while(fast!=null && fast.next!=null) 
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		if (fast != null) {
            slow = slow.next;
        }
		q=reverse(slow);
		while(q.next!=null) 
		{
			if(!(p.val==q.val)) 
			{
				System.out.println("Not a Palindrome");
				return;
			}
			p=p.next;
			q=q.next;
		}
		System.out.println("It is Palindrome");
	}
	public static Node<Integer>reverse( Node<Integer>head)
	{
		Node<Integer>prev=null,next=null,current=head;
		while(current!=null) 
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	public static void print(Node<Integer> p) 
	{
		while(p!=null) 
		{
			System.out.print(p.val+" ");
			p=p.next;
		}
	}
}
