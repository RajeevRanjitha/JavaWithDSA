package genericTrees;

public class RemoveLeafNodes {
	public static void main(String args[]) 
	{
		TakeLevelWiseInput obj=new TakeLevelWiseInput();
		obj.takeLevelWiseInput();
		System.out.println(removeLeafNodes(obj.root).val);
	}
	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.children.size() == 0) {
            return null;
        }
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            if (child.children.size() == 0) {
                root.children.remove(i);
                i--;
            } else {
                root.children.set(i, removeLeafNodes(child));
            }
        }
        return root;
    }

}
