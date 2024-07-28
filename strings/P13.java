package strings;
import java.util.Scanner;
public class P13 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str=sc.nextLine();
		String str1="";
		int start=0;
		int end=0;
		String str2="";
		int i=0;
		int j=0;
		for(i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==' ') 
			{
				end=i-1;
				for(j=start;j<=end;j++) 
				{
					str2=str.charAt(j)+str2;
				}
				start=end+1;
				str1+=str2+" ";
				str2="";
			}
		}
		end=str.length()-1;
		for(j=start;j<=end;j++) 
		{
			str2=str.charAt(j)+str2;
		};
		str1+=str2;
		System.out.println(str1);
	}
	
}
