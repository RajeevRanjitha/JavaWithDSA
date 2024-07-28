package Recursion;
import java.util.Scanner;
public class RemoveCharactersFromString
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		String str1="";
		System.out.println("Enter the character you want to remove");
		char ch=sc.next().charAt(0);
		System.out.println(removeChar(str,str1,ch,0));
	}
	public static String removeChar(String str1,String str2,char ch,int n) 
	{
		if(n==str1.length()) 
		{
			return str2;
		}
		if(!(str1.charAt(n)==ch)) 
		{
			str2+=str1.charAt(n);
		}
		return removeChar(str1,str2,ch,n+1);
	}
}