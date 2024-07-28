package enum_;
public class P2use {
    public static void main(String args[]) 
    {
    	P2 obj=P2.MINUS;
    	System.out.println(obj.apply(2,40));
    	System.out.println(obj.getStr());
    	obj.print();
    }
}
