package strings;
import java.util.Scanner;
public class P8{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		boolean val=checkPalindrome(str);
		System.out.println(val);
	}
	public static boolean checkPalindrome(String str) 
	{
		boolean val=true;
		int n=str.length()-1;
		for(int i=0;i<str.length()/2;i++) 
		{
			if(str.charAt(i)!=str.charAt(n)) 
			{
				val=false;
			}
			n--;
		}
		return val;
	}
}
