package binarySearchTrees;
public class BSTclassUse {
	public static void main(String args[]) 
	{
		BSTclass obj=new BSTclass();
		obj.insert(10);
		obj.insert(20);
		obj.insert(45);
		obj.insert(25);
		obj.insert(8);
		obj.insert(2);
		obj.insert(90);
		obj.isPresent(45);
		obj.printTree();
		obj.delete(10);
		obj.printTree();
	}
}
