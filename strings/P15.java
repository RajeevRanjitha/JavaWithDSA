package strings;
import java.util.Scanner;
public class P15 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		String finalString="";
		for(String x: str1) 
		{
			finalString=" "+x+finalString;
		}
		System.out.println(finalString);
	}
}
