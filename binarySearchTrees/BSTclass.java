package binarySearchTrees;
import linkedlist.Node;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
public class BSTclass{
	private BinaryNodeClass<Integer>root;
	private int size;
	public boolean isPresent(int x)
	{
		return isPresentHelper(root,x);
	}
	public void delete(int x)
	{
		if(deleteHelper(root,x).val)
		{
			root=deleteHelper(root,x).node;
			System.out.println("Element Found");
		}
		else 
		{
			System.out.println("Element not Found");
		}
	}
	private DeleteNodeHelperClass deleteHelper(BinaryNodeClass<Integer> root, int x) {
	    DeleteNodeHelperClass result = new DeleteNodeHelperClass();

	    if (root == null) {
	        return result;
	    }

	    if (x < root.val) {
	        DeleteNodeHelperClass leftResult = deleteHelper(root.left, x);
	        root.left = leftResult.node;
	        result.node = root;
	        result.val = leftResult.val;
	    } else if (x > root.val) {
	        DeleteNodeHelperClass rightResult = deleteHelper(root.right, x);
	        root.right = rightResult.node;
	        result.node = root;
	        result.val = rightResult.val;
	    } else {
	        if (root.left == null && root.right == null) {
	            result.node = null;
	            result.val = true;
	        } else if (root.left == null) {
	            result.node = root.right;
	            result.val = true;
	        } else if (root.right == null) {
	            result.node = root.left;
	            result.val = true;
	        } else {
	            BinaryNodeClass<Integer> minNode = findMin(root.right);
	            root.val = minNode.val;
	            DeleteNodeHelperClass rightResult = deleteHelper(root.right, minNode.val);
	            root.right = rightResult.node;
	            result.node = root;
	            result.val = true;
	        }
	    }

	    return result;
	}

	private BinaryNodeClass<Integer> findMin(BinaryNodeClass<Integer> root) {
	    if (root == null || root.left == null) {
	        return root;
	    }
	    return findMin(root.left);
	}

	private boolean isPresentHelper(BinaryNodeClass<Integer>root,int x) 
	{
		if(root==null) 
		{
			return false;
		}
		if(root.val==x) 
		{
			return true;
		}
		if(x>root.val) 
		{
			return isPresentHelper(root.right,x);
		}
		if(x<=root.val) 
		{
			return isPresentHelper(root.left,x);
		}
		return false;
	}
	public void insert(int x) 
	{
		root=inserthelper(root,x);
	}
	private BinaryNodeClass<Integer> inserthelper(BinaryNodeClass<Integer>root,int x) 
	{
		if(root==null)
		{
			BinaryNodeClass<Integer>node=new BinaryNodeClass<Integer>(x);
			root=node;
			size++;
			return root;
		}
		if(x>root.val) 
		{
			root.right=inserthelper(root.right,x);
			size++;
		}
		if(x<root.val) 
		{
			root.left=inserthelper(root.left,x);
			size++;
		}
		return root;
	}
	public int size() 
	{
		return size;
	}
	public void printTree() 
	{
		printTreeHelper(root);
	}
	private void printTreeHelper(BinaryNodeClass<Integer>root) 
	{
		if(root==null) 
		{
			return ;
		}
		System.out.print(root.val+" ");
		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	public Node<Integer> linkedList() {
		Node<Integer>head=null,tail=null;
		return linkedListHelper(root,head,tail);
	}
	private Node<Integer> linkedListHelper(BinaryNodeClass<Integer> root, Node<Integer> head, Node<Integer> tail) {
	    if (root == null) {
	        return null;
	    }
	    Queue<BinaryNodeClass<Integer>> q = new LinkedList<>();
	    q.add(root);
	    while (!q.isEmpty()) {
	        BinaryNodeClass<Integer> currentNode = q.poll();
	        Node<Integer> newNode = new Node<>(currentNode.val);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	        if (currentNode.left != null) {
	            q.add(currentNode.left);
	        }
	        if (currentNode.right != null) {
	            q.add(currentNode.right);
	        }
	    }

	    return head;
	}
	public BinaryNodeClass<Integer> getRoot() {
		return root;
	}
}
