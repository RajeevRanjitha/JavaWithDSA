package Recursion;
import java.util.Scanner;
public class ReplacCharAtApproach2 {
	static String str1="";
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Enter the character you want to replace");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the replacement character");
		char c=sc.next().charAt(0);
		System.out.println(replacechar(str,ch,c));
	}
	public static String replacechar(String str,char ch,char c) 
	{
		if(str.length()==0) 
		{
			return ""; 
		}
		else if(str.charAt(0)==ch)
		{
			return c+replacechar(str.substring(1),ch,c);
		}
		return str.charAt(0)+replacechar(str.substring(1),ch,c);
	}
}
