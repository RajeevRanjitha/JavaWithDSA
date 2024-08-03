package stack;
public class ArrayDoubleStackUse {
	public static void main(String args[]) 
	{
		ArrayDoubleStack stack=new ArrayDoubleStack();
		stack.push(56);
		stack.push(58);
		stack.push(100);
		stack.push(50);
		stack.print();
		System.out.println("StackSize"+stack.size());
	}
}
