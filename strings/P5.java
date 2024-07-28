package strings;
import java.util.Scanner;
public class P5 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		for(int i=0;i<str.length();i++) 
		{
			System.out.println(str.charAt(i));
		}
	}
}
