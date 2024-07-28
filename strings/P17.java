package strings;
import java.util.Scanner;
public class P17 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.next();
		String upstr="";
		int i=0;
		for(i=0;i<str.length()-1;i++) 
		{
			if(str.charAt(i)!=str.charAt(i+1)) 
			{
				upstr+=str.charAt(i);
			}
		}
		if(str.charAt(i)==str.charAt(i-1)) 
		{
			upstr+=str.charAt(i);
		}
		System.out.println(upstr);
	}
}
