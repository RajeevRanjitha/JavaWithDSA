package trees;
public class CreateAndInsertDuplicateNodeLeft {
    public static void main(String[] args) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>();
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        solution(root);
        obj.printlevelWise(root);
    }
    private static void solution(BinaryNodeClass<Integer> root) {
        if (root == null) {
            return;
        }
        BinaryNodeClass<Integer> duplicate = new BinaryNodeClass<>(root.val);
        duplicate.left = root.left;
        root.left = duplicate;
        solution(duplicate.left);
        solution(root.right);
    }
}
