package Recursion;
import java.util.Scanner;
public class RemoveConsecutivestoOneElement {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str1=sc.next();
		StringBuffer str=new StringBuffer(str1);
		consecutiveremove(str,0);
		System.out.println(str);
	}
	public static void consecutiveremove(StringBuffer str,int n) 
	{
		if(n>=str.length()-1) 
		{
			return;
		}
		if(str.charAt(n)==str.charAt(n+1)) 
		{
			str.replace(n, n+2, str.substring(n,n+1));
		}
		consecutiveremove(str,n+1);
	}
}
