package trees;
public class ConstructTreeUsingInorderAndPreOrder {
    public static void main(String[] args) {
        int preOrder[] = {};
        int inOrder[] = {};
        BinaryNodeClass<Integer> root = solution(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
    }
    private static BinaryNodeClass<Integer> solution(int[] preOrder, int[] inOrder, int siPre, int eiPre, int siIn, int eiIn) {
        if (siPre > eiPre) {
            return null;
        }
        int rootData = preOrder[siPre];
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
        int preOrderLeftStartIndex = siPre + 1;
        int lengthOfSub = inOrderLeftEndIndex - inOrderLeftStartIndex + 1;
        int preOrderLeftEndIndex = preOrderLeftStartIndex + lengthOfSub - 1;
        int preOrderRightStartIndex = preOrderLeftEndIndex + 1;
        int preOrderRightEndIndex = eiPre;
        root.left = solution(preOrder, inOrder, preOrderLeftStartIndex, preOrderLeftEndIndex, inOrderLeftStartIndex, inOrderLeftEndIndex);
        root.right = solution(preOrder, inOrder, preOrderRightStartIndex, preOrderRightEndIndex, inOrderRightStartIndex, inOrderRightEndIndex);
        return root;
    }
}
