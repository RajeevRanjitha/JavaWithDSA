package trees;
public class MinimumAndMaximumFromBinaryTree {
	public static void main(String args[]) {
		BinaryNodeClass<Integer> obj = new BinaryNodeClass<Integer>();
		BinaryNodeClass<Integer> root = obj.levelWiseInput();
		Pair pair = minMax(root);
		System.out.println("The Maximum element in the tree is " + pair.max);
		System.out.println("The Minimum Element in the tree is " + pair.min);
	}
	private static Pair minMax(BinaryNodeClass<Integer> root) {
		if (root == null) {
			return new Pair();
		}
		Pair leftPair = minMax(root.left);
		Pair rightPair = minMax(root.right);
		Pair currentPair = new Pair();
		currentPair.min = Math.min(root.val, Math.min(leftPair.min, rightPair.min));
		currentPair.max = Math.max(root.val, Math.max(leftPair.max, rightPair.max));
		return currentPair;
	}
}
class Pair {
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
}