package strings;
import java.util.Scanner;
public class P12 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		StringBuffer str=new StringBuffer("Ranjitha");
		str.append("Rajeev");
		str.replace(1, 2, "Ranjitha");
		str.insert(1, "Hi");
		System.out.println(str);
		System.out.println(str.indexOf("a"));
	}
}
