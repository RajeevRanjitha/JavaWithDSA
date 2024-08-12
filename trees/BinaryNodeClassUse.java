package trees;

public class BinaryNodeClassUse {
	public static void main(String args[]) 
	{
		BinaryNodeClass<Integer> root=new BinaryNodeClass<Integer>(1);
		BinaryNodeClass<Integer> rootleft=new BinaryNodeClass<Integer>(2);
		BinaryNodeClass<Integer> rootright=new BinaryNodeClass<Integer>(3);
		root.left=rootleft;
		root.right=rootright;
		BinaryNodeClass<Integer> obj4=new BinaryNodeClass<Integer>(4);
		BinaryNodeClass<Integer> obj6=new BinaryNodeClass<Integer>(6);
		rootleft.right=obj4;
		obj4.left=obj6;
		BinaryNodeClass<Integer> obj5=new BinaryNodeClass<Integer>(5);
		BinaryNodeClass<Integer> obj7=new BinaryNodeClass<Integer>(7);
		rootright.left=obj5;
		obj5.right=obj7;
		root.printDetailed(root);
		BinaryNodeClass<Integer> obj=new BinaryNodeClass<Integer>();
//		BinaryNodeClass<Integer> root1 = obj.input();
//		System.out.println("The Detailed Tree");
//		obj.printDetailed(root1);
//		BinaryNodeClass<Integer> root2 = obj.Detailedinput(true, null, false);
//		obj.printDetailed(root2);
		BinaryNodeClass<Integer> root3 = obj.levelWiseInput();
		obj.printDetailed(root3);
		System.out.println("Printing LevelWise");
		obj.printlevelWise(root3);
	}
}
