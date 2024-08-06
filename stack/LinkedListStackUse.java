package stack;
public class LinkedListStackUse {
    public static void main(String[] args) throws EmptYException {
        System.out.println("Stack Carrying Only Integers");
        LinkedListStack<Integer> intStack = new LinkedListStack<>();
        intStack.push(100);
        intStack.push(50);
        intStack.push(150);
        intStack.push(300);
        System.out.println("Integer Stack before reversal:");
        intStack.print();
        intStack.reverseRecursivelyHelper();
        System.out.println("Integer Stack after reversal:");
        intStack.print();
        System.out.println("Stack Carrying Only Strings");
        LinkedListStack<String> strStack = new LinkedListStack<>();
        strStack.push("Ranjtiha Gayatri");
        strStack.push("VenkataRajeev");
        strStack.push("Viswanatham");
        strStack.push("Sridevi");
        System.out.println("String Stack before reversal:");
        strStack.print();
        strStack.reverseRecursivelyHelper();
        System.out.println("String Stack after reversal:");
        strStack.print();
    }
}
