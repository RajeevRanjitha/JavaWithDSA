package trees;
import java.util.*;
public class RootToLeafPathsWithSumK {
	static Scanner sc=new Scanner(System.in);
    private static void printPaths(BinaryNodeClass<Integer> root, int K, List<Integer> path) {
        if(root==null) 
        {
        	return;
        }
        path.add(root.val);
        System.out.println("Visiting node :"+root.val+", current Path"+path);
        if(root.left==null && root.right==null && K==root.val) 
        {
        	System.out.println("Found Path");
        }
        else 
        {
        	printPaths(root.left,K-root.val,path);
        	printPaths(root.right,K-root.val,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String args[]) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>(null);
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        System.out.println("Enter the value of K");
        int K = sc.nextInt();
        List<Integer> path = new ArrayList<>();
        printPaths(root, K,path);
    }
}
