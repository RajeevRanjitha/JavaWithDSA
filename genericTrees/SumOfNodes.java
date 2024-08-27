package genericTrees;

public class SumOfNodes {
	public static void main(String args[]) 
	{
		TreeNode<Integer>obj=new TreeNode<>(23);
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
		obj.children.add(obj3);
		obj1.children.add(obj4);
		obj1.children.add(obj5);
		obj1.children.add(obj6);
		obj2.children.add(obj7);
		obj3.children.add(obj9);
		obj3.children.add(obj8);
		System.out.println(sum(obj));
	}
	private static int sum(TreeNode<Integer> obj) {
		int sum=obj.val;
		for(int i=0;i<obj.children.size();i++) 
		{
			int x=sum(obj.children.get(i));
			sum+=x;
		}
		return sum;
	}
}
