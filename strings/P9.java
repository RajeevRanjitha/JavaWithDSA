package strings;
import java.util.Scanner;
public class P9 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String ars[]) 
	{
		String str1="Ranjitha";
		String str2="Ranjitha";
		String str3="Ranjitha";
		String str4=new String("Ranjitha");
		String str5=new String("Ranjitha");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1==str2);
		System.out.println(str4==str5);
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		
	}
}
