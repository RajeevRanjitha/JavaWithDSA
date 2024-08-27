package genericTrees;

public class CreateTakeInputUse {
	@SuppressWarnings("static-access")
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		PrintBetterWay obj1=new PrintBetterWay();
		obj1.print(obj.root);
	}
}
