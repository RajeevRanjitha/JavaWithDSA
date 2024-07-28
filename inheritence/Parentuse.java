// Parentuse.java
package inheritence;

import java.util.Scanner;

public class Parentuse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Child1 c = new Child1("Viswanatham");
        System.out.print("Enter child's name: ");
        c.name = sc.next();
        System.out.print("Enter child's roll number: ");
        c.rollno = sc.nextInt();
        c.parentPrint();
        c.print();
        System.out.println(c.father);
    }
}
