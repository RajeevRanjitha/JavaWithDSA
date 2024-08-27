package trees;

public class CheckBST {
    public static void main(String[] args) {
        BinaryNodeClass<Integer> obj = new BinaryNodeClass<>();
        BinaryNodeClass<Integer> root = obj.levelWiseInput();
        obj.printlevelWise(root);
        System.out.println();
        System.out.println(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    private static boolean checkBST(BinaryNodeClass<Integer> root, int min, int max) {
    	if(root==null) 
    	{
    		return true;
    	}
    	if(root.val<min || root.val>max) 
    	{
    		return false;
    	}
    	return checkBST(root.left,min,root.val-1) && checkBST(root.right,root.val+1,max);
    }
}
