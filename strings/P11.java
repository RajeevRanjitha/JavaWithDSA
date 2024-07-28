package strings;
import java.util.Scanner;
public class P11 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the String ");
		String str=sc.next();
		for(int i=0;i<str.length();i++) 
		{
			for(int j=0;j<str.length()-i;j++) 
			{
				System.out.println(str.substring(j,i+j+1));
			}
		}
	}
}
