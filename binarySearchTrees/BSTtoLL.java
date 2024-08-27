package binarySearchTrees;
import linkedlist.Node;
public class BSTtoLL {
    private static Node<Integer> prev = null;
    private static Node<Integer> head = null;
    public static void main(String[] args) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>();
        BinaryNodeClass<Integer> root = obj.createBinary();
        head = bstToLL(root);
        printLinkedList(head);
    }
    public static Node<Integer> bstToLL(BinaryNodeClass<Integer> root) {
        if (root == null) {
            return null;
        }
        bstToLL(root.left);
        Node<Integer> newNode = new Node<>(root.val);
        if (head == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        prev = newNode;
        bstToLL(root.right);
        return head;
    }
    private static void printLinkedList(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}