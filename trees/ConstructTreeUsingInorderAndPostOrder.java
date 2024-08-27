package trees;
public class ConstructTreeUsingInorderAndPostOrder {
    public static void main(String[] args) {
        int postOrder[] = {};
        int inOrder[] = {};
        BinaryNodeClass<Integer>obj=new BinaryNodeClass<Integer>();
        System.out.println("");
        BinaryNodeClass<Integer> root = solution(postOrder, inOrder, 0, postOrder.length - 1, 0, inOrder.length - 1);
        obj.printlevelWise(root);
        System.out.println("");
    }
    private static BinaryNodeClass<Integer> solution(int[] postOrder, int[] inOrder, int siPost, int eiPost, int siIn, int eiIn) {
        if (siPost > eiPost) {
            return null;
        }
        int rootData = postOrder[eiPost];
        BinaryNodeClass<Integer> root = new BinaryNodeClass<>(rootData);
        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (inOrder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        int inOrderLeftStartIndex = siIn;
        int inOrderLeftEndIndex = rootIndex - 1;
        int inOrderRightStartIndex = rootIndex + 1;
        int inOrderRightEndIndex = eiIn;
        int lengthOfLeftSubtree = inOrderLeftEndIndex - inOrderLeftStartIndex + 1;
        int postOrderLeftEndIndex = siPost + lengthOfLeftSubtree - 1;
        int postOrderRightStartIndex = postOrderLeftEndIndex + 1;
        root.left = solution(postOrder, inOrder, siPost, postOrderLeftEndIndex, inOrderLeftStartIndex, inOrderLeftEndIndex);
        root.right = solution(postOrder, inOrder, postOrderRightStartIndex, eiPost - 1, inOrderRightStartIndex, inOrderRightEndIndex);
        return root;
    }
}
