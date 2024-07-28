package strings;
import java.util.Scanner;
public class P6 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.nextLine();
		int count =1;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==' ') 
			{
				count ++;
			}
		}
		System.out.println(count);
	}
}
