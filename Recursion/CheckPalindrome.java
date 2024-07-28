package Recursion;
import java.util.Scanner;
public class CheckPalindrome {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(checkPalindrome(str,0,str.length()-1));
	}
	public static boolean checkPalindrome(String str,int start,int end) 
	{
		if(start>=end) 
		{
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) 
		{
			return false;
		}
		return checkPalindrome(str,start+1,end-1);
	}
}
