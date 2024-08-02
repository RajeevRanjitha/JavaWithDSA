package linkedlist;
import java.util.Scanner;
public class BubbleSortLL {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Node<Integer>head=create();
		bubbleSort(head);
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
	public static Node<Integer> bubbleSort(Node<Integer> head) {
	    if (head == null || head.next == null) {
	        return head;
	    }

	    int n = length(head);

	    Node<Integer> node1, node2;
	    for (int i = 0; i < n - 1; i++) {
	        node1 = head;
	        node2 = head.next;

	        for (int j = 0; j < n - i - 1; j++) {
	            if (node1.val > node2.val) {
	                int temp = node1.val;
	                node1.val = node2.val;
	                node2.val = temp;
	            }
	            node1 = node1.next;
	            node2 = node2.next;
	        }
	    }
	    
	    return head;
	}
	public static int length(Node<Integer> p) {
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }
}
