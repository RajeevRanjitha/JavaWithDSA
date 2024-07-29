package linkedlist;
import java.util.Scanner;
public class LinkedListUse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        print(head);
        System.out.println();
        System.out.println("The length of the linked list is " + length(head));
        System.out.println("Printing the ith Node data");
        printithNode(head, length(head));
        head = insert(head, length(head));
        System.out.println();
        print(head);
        head = delete(head, length(head));
        System.out.println();
        print(head);
        System.out.println();
        System.out.println(search(head));
        head = appendLast(head, length(head));
        System.out.println();
        print(head);
        System.out.println("The Reverse of the linkedList is ");
        head = reverse(head);
        System.out.println();
        print(head);
        System.out.println("Printing the linkedList using Recursion");
        printRecursion(head);
//        System.out.println("Enter the position where you want to insert");
//        int x = sc.nextInt();
//        System.out.println("Enter the position where you want to insert");
//        int n = sc.nextInt();
//        head = insertRecursively(head,n, x);
//        System.out.println("Linked list after recursive insertion:");
//        print(head);
        System.out.println("Reversing the Array Using Recursion"); 
    }
    public static Node<Integer> createLinkedList() {
        Node<Integer> head;
        System.out.println("Enter the value of the node");
        int n = sc.nextInt();
        Node<Integer> node1 = new Node<>(n);
        head = node1;
        Node<Integer> tail = head;
        while (true) {
            System.out.println("Do you want to add more Nodes enter y or n");
            String str = sc.next();
            if (str.equals("y")) {
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
        if (n > length) {
            return;
        } else {
            for (int i = 0; i <= n; i++) {
                if (p == null) {
                    break;
                }
                if (i == n) {
                    System.out.println("The value at the position " + n + " is " + p.val);
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
        System.out.println("Enter the Number you want to search");
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
        System.out.println(head.val);
        printRecursion(head.next);
    }
//    public static insertRecursively(Node<Integer>head,int val,int pos) 
//    {
//    	if(head==null && pos==0) 
//    	{
//    		
//    	}
//    }
}
