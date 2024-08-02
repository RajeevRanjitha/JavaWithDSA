package linkedlist;
import java.util.Scanner;
public class AllOddsAtStartingAndAllEvensAtTheEnding {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Node<Integer>head=create();
		head=requiredFunction(head);
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
	public static Node<Integer> requiredFunction(Node<Integer>head)
	{
		Node<Integer>updateOdd=null,headOdd=null,updateEven=null,headEven=null;
		Node<Integer>p=head;
		while(p!=null) 
		{
			if(p.val%2==0)
			{
				if(updateEven==null) 
				{
					updateEven=p;
					headEven=p;
				}
				else {
					updateEven.next=p;
					updateEven=p;
				}
				
			}
			else 
			{
				if(updateOdd==null) 
				{
					updateOdd=p;
					headOdd=p;
				}
				else 
				{
					updateOdd.next=p;
					updateOdd=p;
				}
			}
			p=p.next;
		}
		if (updateEven != null) {
            updateEven.next = null;
        }
		if(updateOdd==null) 
		{
			return headEven;
		}
		else 
		{
			updateOdd.next=headEven;
			return headOdd;
		}
	}
	public static void print(Node<Integer>head) 
	{
		Node<Integer>p=head;
		while(p!=null) 
		{
			System.out.println(p.val);
			p=p.next;
		}
	}
}
