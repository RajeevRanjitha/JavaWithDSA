package trees;
import java.util.Scanner;
public class NodesAtDistanceK {
    private static BinaryNodeClass<Integer> findTarget(BinaryNodeClass<Integer> root, int target) {
        if (root == null || root.val.equals(target)) {
            return root;
        }
        BinaryNodeClass<Integer> leftResult = findTarget(root.left, target);
        return leftResult != null ? leftResult : findTarget(root.right, target);
    }
    private static int printNodesAtDistanceK(BinaryNodeClass<Integer> node, BinaryNodeClass<Integer> target, int K) {
        if (node == null) return -1;

        if (node == target) {
            printSubtreeNodesAtDistanceK(node, K);
            return 0;
        }
        int leftDistance = printNodesAtDistanceK(node.left, target, K);
        if (leftDistance != -1) {
            if (leftDistance + 1 == K) {
                System.out.println(node.val);
            } else {
                printSubtreeNodesAtDistanceK(node.right, K - leftDistance - 2);
            }
            return leftDistance + 1;
        }
        int rightDistance = printNodesAtDistanceK(node.right, target, K);
        if (rightDistance != -1) {
            if (rightDistance + 1 == K) {
                System.out.println(node.val);
            } else {
                printSubtreeNodesAtDistanceK(node.left, K - rightDistance - 2);
            }
            return rightDistance + 1;
        }
        return -1;
    }
    private static void printSubtreeNodesAtDistanceK(BinaryNodeClass<Integer> node, int K) {
        if (node == null || K < 0) return;
        if (K == 0) {
            System.out.println(node.val);
        } else {
            printSubtreeNodesAtDistanceK(node.left, K - 1);
            printSubtreeNodesAtDistanceK(node.right, K - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>();
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        System.out.println("Enter the target node value:");
        int target = scanner.nextInt();
        System.out.println("Enter the distance K:");
        int K = scanner.nextInt();
        BinaryNodeClass<Integer> targetNode = findTarget(root, target);
        if (targetNode == null) {
            System.out.println("Target node not found.");
        } else {
            printNodesAtDistanceK(root, targetNode, K);
        }
    }
}
