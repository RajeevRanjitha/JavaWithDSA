package strings;
import java.util.Scanner;
public class P19 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		String str=sc.next();
		System.out.println("Enter the charachter that ypu want to remove");
		String up="";
		char ch=sc.next().charAt(0);
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==ch) 
			{
				continue;
			}
			up+=str.charAt(i);
		}
		System.out.println(up);
	}
}
