package strings;
import java.util.Scanner;
public class P14 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String sm="";
		String fn="";
		int i=0;
		String str=sc.nextLine();
		for(i=0;i<str.length();i++) 
		{
			sm+=str.charAt(i);
			if(str.charAt(i)==' ') 
			{
				fn=" "+sm+fn;
				sm="";
			}
		}
		fn=sm+fn;
		sm="";
		System.out.println(fn);
	}
}
