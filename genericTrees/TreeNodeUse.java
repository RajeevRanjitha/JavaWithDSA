package genericTrees;

public class TreeNodeUse {
	public static void main(String args[]) 
	{
		TreeNode<Integer>obj=new TreeNode<Integer>(10);
		TreeNode<Integer>obj1=new TreeNode<Integer>(11);
		TreeNode<Integer>obj2=new TreeNode<Integer>(12);
		TreeNode<Integer>obj3=new TreeNode<Integer>(13);
		TreeNode<Integer>obj4=new TreeNode<Integer>(14);
		TreeNode<Integer>obj5=new TreeNode<Integer>(15);
		TreeNode<Integer>obj6=new TreeNode<Integer>(16);
		TreeNode<Integer>obj7=new TreeNode<Integer>(17);
		TreeNode<Integer>obj8=new TreeNode<Integer>(18);
		TreeNode<Integer>obj9=new TreeNode<Integer>(19);
		obj.children.add(obj1);
		obj.children.add(obj2);
		obj.children.add(obj4);
		obj.children.add(obj5);
		obj5.children.add(obj9);
		obj9.children.add(obj7);
		obj8.children.add(obj6);
		obj2.children.add(obj8);
		obj.children.add(obj3);
	}
}
