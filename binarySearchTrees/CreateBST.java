package binarySearchTrees;
import java.util.Scanner;
public class CreateBST {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer>root=obj.createBinary();
		obj.printlevelWise(root);
	}
}
