package Recursion;
import java.util.Scanner;
public class ReplaceCharacter
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the String ");
		String str1=sc.next();
		StringBuffer str=new StringBuffer(str1);
		System.out.println("Enter the character you want to replace ");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter the character you want to replace with");
		char ch2=sc.next().charAt(0);
		replaceChar(str,0,ch1,ch2);
		System.out.println(str);
	}
	public static void replaceChar(StringBuffer str,int n,char ch1,char ch2) 
	{
		if(n==str.length()) 
		{
			return;
		}
		if(str.charAt(n)==ch1) 
		{
			str.setCharAt(n, ch2);
		}
		replaceChar(str,n+1,ch1,ch2);
	}
}