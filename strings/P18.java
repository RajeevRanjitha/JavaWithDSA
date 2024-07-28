package strings;
import java.util.Scanner;
public class P18 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.nextLine();
		String word="";
		String finalString="";
		int i=0;
		for(i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==' ') 
			{
				finalString=finalString+word+" ";
				word="";
			}
			word=str.charAt(i)+word;
		}
		finalString=finalString+word;
		System.out.println(finalString);
	}
}
