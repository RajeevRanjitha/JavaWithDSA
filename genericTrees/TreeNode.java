package genericTrees;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeNode<T> {
    static Scanner sc = new Scanner(System.in);
    T val;
    ArrayList<TreeNode<T>> children;
    TreeNode(T x) {
        val = x;
        children = new ArrayList<>();
    }
    TreeNode() {
        children = new ArrayList<>();
    }
}
