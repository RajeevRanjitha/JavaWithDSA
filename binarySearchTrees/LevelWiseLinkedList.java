package binarySearchTrees;
import linkedlist.Node;
public class LevelWiseLinkedList {
	public static void main(String args[]) 
	{
		BSTclass obj=new BSTclass();
		obj.insert(23);
		obj.insert(46);
		obj.insert(70);
		obj.insert(67);
		obj.insert(90);
		obj.insert(12);
		obj.insert(29);
		Node<Integer>head=obj.linkedList();
		while(head!=null) 
		{
			System.out.println(head.val);
			head=head.next;
		}
	}
}
