package genericTrees;

public class NodeHavingSumOfChildrenAndIsMax {
    public static void main(String args[]) {
        TakeLevelWiseInput obj = new TakeLevelWiseInput();
        obj.takeLevelWiseInput();
        TreeNode<Integer> maxNode = nodeHavingSumOfChildrenAndIsMax(obj.root);
        if (maxNode != null) {
            System.out.println("Node with maximum sum of itself and its children: " + maxNode.val);
        }
    }
    private static TreeNode<Integer> nodeHavingSumOfChildrenAndIsMax(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        TreeNode<Integer> maxNode = root;
        int maxSum = getSum(root);
        for (TreeNode<Integer> child : root.children) {
            TreeNode<Integer> childMaxNode = nodeHavingSumOfChildrenAndIsMax(child);
            int childSum = getSum(childMaxNode);
            if (childSum > maxSum) {
                maxSum = childSum;
                maxNode = childMaxNode;
            }
        }
        return maxNode;
    }
    private static int getSum(TreeNode<Integer> node) {
        if (node == null) 
        {
        	return 0;
        } 
        int sum = node.val;
        for (TreeNode<Integer> child : node.children) {
            sum += child.val;
        }
        return sum;
    }
}