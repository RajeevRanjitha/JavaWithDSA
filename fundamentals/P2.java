package fundamentals;
import java.util.Scanner;
public class P2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		String str=sc.next();
		System.out.println("Enter the 3 subjects Marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(str+"\n"+(a+b+c)/3);
	}
}
