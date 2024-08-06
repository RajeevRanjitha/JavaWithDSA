package stack;
import linkedlist.Node;
public class LinkedListStack<T> {
    private Node<T> top;
    private int size;
    public LinkedListStack() {
        top = null;
        size = 0;
    }
    public Node<T> getTop() {
        return top;
    }
    public void push(T a) {
        Node<T> node = new Node<>(a);
        node.next = top;
        top = node;
        size++;
    }
    public T pop() throws EmptYException {
        if (top == null) {
            throw new EmptYException();
        }
        T value = top.val;
        top = top.next;
        size--;
        return value;
    }
    public T top_() throws EmptYException {
        if (top == null) {
            throw new EmptYException();
        }
        return top.val;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void print() {
        Node<T> current = top;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
    private Node<T> reverseRecursively(Node<T> current, Node<T> prev) {
        if (current == null) {
            return prev;
        }
        Node<T> next = current.next;
        current.next = prev;
        return reverseRecursively(next, current);
    }
    public void reverseRecursivelyHelper() {
        top = reverseRecursively(top, null);
    }
}
