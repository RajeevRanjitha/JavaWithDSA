package stack;
public class LinkedListStackUse {
	public static void main(String args[]) throws EmptYException 
	{
		System.out.println("Stack Carrying Only Integers");
		LinkedListStack<Integer> intStack=new LinkedListStack<>();
		System.out.println(intStack.isEmpty());
		intStack.push(100);
		intStack.push(50);
		intStack.push(150);
		intStack.push(300);
		System.out.println(intStack.size());
		System.out.println(intStack.pop());
		System.out.println(intStack.size());
		System.out.println(intStack.top_());
		System.out.println(intStack.isEmpty());
		
		
		System.out.println("Stack Carrying Only Strings");
		LinkedListStack<String>strStack=new LinkedListStack<>();
		System.out.println(intStack.isEmpty());
		strStack.push("Ranjtiha Gayatri");
		strStack.push("VenkataRajeev");
		strStack.push("Viswanatham");
		strStack.push("Sridevi");
		System.out.println(strStack.size());
		System.out.println(strStack.pop());
		System.out.println(strStack.size());
		System.out.println(strStack.top_());
		System.out.println(strStack.isEmpty());
	}
}
