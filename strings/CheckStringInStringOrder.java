package strings;
import java.util.Scanner;
public class CheckStringInStringOrder {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		boolean var=true;
		String str1=sc.next();
		String str2=sc.next();
		int k=0;
		int count=0;
		for(int i=0;i<str1.length();i++) 
		{
			for(int j=k;j<str2.length();j++) 
			{
				if(str1.charAt(i)==str2.charAt(j)) 
				{
					count++;
					k=j;
				}
			}
		}
		if(count !=str1.length()) 
		{
			var=false;
		}
		if(var) 
		{
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	}
}
