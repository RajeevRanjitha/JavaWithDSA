package genericTrees;

public class HeightOfGenericTree {
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println(findHeight(obj.root));
	}

	private static int findHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        for (TreeNode<Integer> child : root.children) {
            int childHeight = findHeight(child);
            height = Math.max(height, childHeight);
        }
        return height + 1;
    }
}
