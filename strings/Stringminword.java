package strings;
import java.util.Scanner;
public class Stringminword {
	static Scanner sc=new Scanner(System.in);
	public static void main(String ags[]) 
	{
		String oldmin="djerdfjgdkljgiriojgdfjklfgiefjgdklfdlgrijgkfdjgoei";
		String newmin="";
		String str=sc.nextLine();
		int i=0;
		for(i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==' ') 
			{
				if(oldmin.length()>newmin.length()) 
				{
					oldmin=newmin;
					newmin="";
				}
				else 
				{
					newmin="";
				}
				i++;
			}
			newmin+=str.charAt(i);
		}
		if(oldmin.length()>newmin.length()) 
		{
			oldmin=newmin;
		}
	System.out.println("The smallest String is "+oldmin);	
	}
}
