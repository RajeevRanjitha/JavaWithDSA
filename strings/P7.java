package strings;
import java.util.Scanner;
public class P7 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		String rev=reverse(str);
		System.out.println(rev);
	}
	public static String reverse(String str) 
	{
		String str1="";
		
		for(int i=0;i<str.length();i++) 
		{
			str1=str.charAt(i)+str1;
		}
		return str1;
	}
}
