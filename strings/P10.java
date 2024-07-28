package strings;
import java.util.Scanner;
public class P10 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the string ");
		String str=sc.next();
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<=str.length();j++) 
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
}
