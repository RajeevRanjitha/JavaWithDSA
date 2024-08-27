package trees;
class DiameterOfTheBinaryTree {
    static class Pair {
        int height;
        int diameter;
        Pair(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static int diameterOfBinaryTree(BinaryNodeClass<Integer> root) {
        return diameterAndHeight(root).diameter;
    }
    private static Pair diameterAndHeight(BinaryNodeClass<Integer> root) {
        if (root == null) {
            return new Pair(0, 0); 
        }
        Pair leftPair = diameterAndHeight(root.left);
        Pair rightPair = diameterAndHeight(root.right);
        int height = 1 + Math.max(leftPair.height, rightPair.height);
        int diameterThroughRoot = leftPair.height + rightPair.height;
        int diameter = Math.max(diameterThroughRoot, Math.max(leftPair.diameter, rightPair.diameter));
        return new Pair(height, diameter);
    }
}
