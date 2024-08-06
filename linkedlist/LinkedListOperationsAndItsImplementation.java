package linkedlist;
import java.util.Scanner;
public class LinkedListOperationsAndItsImplementation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Creating the LinkedList");
        Node<Integer> head = createLinkedList();
        print(head);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print linked list");
            System.out.println("2. Get length of linked list");
            System.out.println("3. Print ith node data");
            System.out.println("4. Insert element");
            System.out.println("5. Delete element");
            System.out.println("6. Search element");
            System.out.println("7. Append last N nodes to the front");
            System.out.println("8. Reverse linked list");
            System.out.println("9. Print linked list using recursion");
            System.out.println("10. Insert element using recursion");
            System.out.println("11. Delete element using recursion");
            System.out.println("12. Reverse linked list using recursion");
            System.out.println("13. Find middle element");
            System.out.println("14. MergeSort");
            System.out.println("15.Swapping of two elements in a linked List");
            System.out.println("16. Kreverse");
            System.out.println("17. Reverse the linkedList");
            System.out.println("18 exit...");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    print(head);
                    break;
                case 2:
                    System.out.println("The length of the linked list is " + length(head));
                    break;
                case 3:
                    printithNode(head, length(head));
                    break;
                case 4:
                    head = insert(head, length(head));
                    System.out.println("After inserting the element, the linked list is ");
                    print(head);
                    break;
                case 5:
                    head = delete(head, length(head));
                    System.out.println("After deleting the element, the linked list is");
                    print(head);
                    break;
                case 6:
                    System.out.println("Search result: " + search(head));
                    break;
                case 7:
                    head = appendLast(head, length(head));
                    System.out.println("After appending last N nodes to the front, the linked list is ");
                    print(head);
                    break;
                case 8:
                    System.out.println("The Reverse of the linked list is ");
                    head = reverse(head);
                    print(head);
                    break;
                case 9:
                    System.out.println("Printing the linked list using Recursion");
                    printRecursion(head);
                    break;
                case 10:
                    System.out.println("Enter the element you want to insert");
                    int x = sc.nextInt();
                    System.out.println("Enter the position where you want to insert");
                    int n = sc.nextInt();
                    head = insertRecursively(head, x, n);
                    System.out.println("The linked list after inserting the element at the position is ");
                    print(head);
                    break;
                case 11:
                    System.out.println("Enter the position where you want to delete the node");
                    n = sc.nextInt();
                    head = deleteRecursively(head, n);
                    System.out.println("After deleting the element using Recursion, the linked list is ");
                    print(head);
                    break;
                case 12:
                    Node<Integer> prev = null;
                    head = reverseLinkedListRecursively(head, prev);
                    System.out.println("Linked List after reversing using recursion is ");
                    print(head);
                    break;
                case 13:
                    System.out.println("The middle element of the LinkedList");
                    Node<Integer> p = midElement(head);
                    System.out.println(p.val);
                    break;
                case 14:
                	Node<Integer>tail=head;
                	while(tail.next!=null) 
                	{
                		tail=tail.next;
                	}
                	System.out.println("MergeSort of the LinkedList");
                	head=mergeSortLL(head,tail);
                	print(head);
                	break;
                case 15:
                	System.out.println("Enter the node number");
                	int m=sc.nextInt();
                	System.out.println("Enter the node number");
                	int n1=sc.nextInt();
                	swapping(head,m,n1);
                	print(head);
                	break;
                case 16:
                	System.out.println("K reverse");
                	head=kReverse(head);
                	print(head);
                	break;
                case 17:
                	System.out.println("Reverse a linkedList using Recursion");
                	head=reverseRecursively(head);
                	System.out.println("After reverse Recursion the Linked List is");
                	print(head);
                case 18:
                	System.out.println("Swapping of Two numbers ... Trying by me");
                	swap(head);
                	print(head);
                case 19:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 14);
    }
	private static void swap(Node<Integer> head) {
		Node<Integer>prevM=head,prevN=head,currentN=head,currentM=head;
		System.out.println("Enter the position you want to replace");
		int m=sc.nextInt();
		System.out.println("Enter the Second Position you want to replace with");
		int n=sc.nextInt();
		if(prevN.next.next==null) 
		{
			Node<Integer> temp=prevM.next;
			temp=prevM;
			prevM=prevN.next;
			prevN.next=temp;
			return;
		}
		else 
		{
			for(int i=0;i<m-1 ;i++) 
			{
				prevM=prevM.next;
			}
			currentM=prevM.next;
			for(int i=0;i<n-1;i++) 
			{
				prevN=prevN.next;
			}
			currentN=prevN.next;
			prevM.next=currentN;
			currentN.next=currentM;
			prevN.next=currentM;
			currentM.next=currentN;
		}
	}
	private static Node<Integer> reverseRecursively(Node<Integer> head) {
		if(head==null |head.next==null) 
		{
			return head;
		}
		Node<Integer>smallerHead,p=head;
		smallerHead=reverseRecursively(head.next);
		p=smallerHead;
		while(p.next!=null) 
		{
			p=p.next;
		}
		p.next=head;
		head.next=null;
		head=smallerHead;
		return head;
	}
	public static Node<Integer> createLinkedList() {
        Node<Integer> head;
        System.out.println("Enter the value of the node");
        int n = sc.nextInt();
        Node<Integer> node1 = new Node<>(n);
        head = node1;
        Node<Integer> tail = head;
        while (true) {
            System.out.println("Do you want to add more Nodes? Enter y or n");
            String str = sc.next();
            if (str.toLowerCase().equals("y")) {
                System.out.println("Enter the value of the node");
                n = sc.nextInt();
                Node<Integer> node = new Node<>(n);
                tail.next = node;
                tail = node;
            } else {
                break;
            }
        }
        return head;
    }
    public static void print(Node<Integer> p) {
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
    public static int length(Node<Integer> p) {
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }
    public static void printithNode(Node<Integer> p, int length) {
        System.out.println("Enter the index of the node");
        int n = sc.nextInt();
        if (n >= length) {
            System.out.println("Index out of bounds");
            return;
        } else {
            for (int i = 0; i <= n; i++) {
                if (p == null) {
                    break;
                }
                if (i == n) {
                    System.out.println("The value at position " + n + " is " + p.val);
                    break;
                }
                p = p.next;
            }
        }
    }
    public static Node<Integer> insert(Node<Integer> head, int length) {
        Node<Integer> p = head;
        System.out.println("Enter the position where you want to insert");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Enter the value you want to insert");
            int val = sc.nextInt();
            Node<Integer> node = new Node<>(val);
            node.next = p;
            head = node;
            return head;
        }
        if (n > length) {
            return head;
        }
        for (int i = 0; i < n - 1; i++) {
            p = p.next;
        }
        System.out.println("Enter the value you want to insert");
        int val = sc.nextInt();
        Node<Integer> node = new Node<>(val);
        node.next = p.next;
        p.next = node;
        return head;
    }
    public static Node<Integer> delete(Node<Integer> head, int length) {
        Node<Integer> p = head;
        System.out.println("Enter the position where you want to delete");
        int n = sc.nextInt();
        if (n >= length) {
            return head;
        }
        if (n == 0) {
            Node<Integer> temp = head;
            head = head.next;
            temp.next = null;
            return head;
        } else {
            for (int i = 0; i < n - 1; i++) {
                p = p.next;
            }
            Node<Integer> temp = p.next;
            p.next = p.next.next;
            temp.next = null;
        }
        return head;
    }
    public static int search(Node<Integer> head) {
        System.out.println("Enter the number you want to search");
        int n = sc.nextInt();
        Node<Integer> p = head;
        int count = 0;
        while (p != null) {
            if (p.val == n) {
                System.out.println("The element " + n + " is found at the index " + count);
                return count;
            }
            count++;
            p = p.next;
        }
        return -1;
    }
    public static Node<Integer> appendLast(Node<Integer> head, int length) {
        Node<Integer> p = head, temp;
        System.out.println("Enter the number of last nodes you want to append at the front");
        int n = sc.nextInt();
        if (n >= length) {
            return head;
        }
        temp = head;
        int i = 0;
        while (i < length - n - 1) {
            p = p.next;
            i++;
        }
        Node<Integer> newHead = p.next;
        p.next = null;
        Node<Integer> current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return newHead;
    }
    public static Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> current, prev, next;
        current = head;
        prev = null;
        next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void printRecursion(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        printRecursion(head.next);
    }
    public static Node<Integer> insertRecursively(Node<Integer> head, int x, int pos) {
        if (head == null && pos > 0) {
            return head;
        } else if (pos == 0) {
            Node<Integer> node = new Node<>(x);
            node.next = head;
            return node;
        } else {
            head.next = insertRecursively(head.next, x, pos - 1);
            return head;
        }
    }
    public static Node<Integer> deleteRecursively(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        } else if (pos == 0) {
            Node<Integer> temp = head;
            head = head.next;
            temp.next = null;
            return head;
        } else {
            head.next = deleteRecursively(head.next, pos - 1);
            return head;
        }
    }
    public static Node<Integer> reverseLinkedListRecursively(Node<Integer> current, Node<Integer> prev) {
       if(current==null) 
       {
    	   return prev;
       }
       Node<Integer>next=current.next;
       current.next=prev;
       return reverseLinkedListRecursively(next,current);
    }

    public static Node<Integer> midElement(Node<Integer> head) {
        Node<Integer> fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node <Integer>  mergeSortLL(Node<Integer> head, Node<Integer> tail) {
        if (head == tail) {
            return head;
        }
        Node<Integer> fast = head, slow = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node<Integer> midNext = slow.next;
        slow.next = null;
        mergeSortLL(head, slow);
        mergeSortLL(midNext, tail);
       return merge(head, midNext);
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
    public static void swapping(Node<Integer> head, int m, int n) {
        if (m == n) {
            return;
        }
        Node<Integer> prevM = null, currM = head;
        for (int i = 0; i < m; i++) {
            prevM = currM;
            currM = currM.next;
        }
        Node<Integer> prevN = null, currN = head;
        for (int i = 0; i < n; i++) {
            prevN = currN;
            currN = currN.next;
        }
        if (prevM != null) {
            prevM.next = currN;
        } else {
            head = currN;
        }
        if (prevN != null) {
            prevN.next = currM;
        } else {
            head = currM;
        }
        Node<Integer> temp = currM.next;
        currM.next = currN.next;
        currN.next = temp;
    }
    public static Node<Integer> kReverse(Node<Integer>head) 
    {
    	System.out.println("Enter the nod from where you want to reverse");
    	int n=sc.nextInt();
    	if(head==null || n>=length(head)) {
    		return head;
    	}
    	if(n==0) 
    	{
    		return reverse(head);
    	}
    	Node<Integer>p=head;
    	for(int i=0;i<n-1;i++) 
    	{
    		p=p.next;
    	}
    	Node<Integer>current=p.next,temp;
    	temp=reverse(current);
    	p.next=temp;
    	return head;
    }
}
