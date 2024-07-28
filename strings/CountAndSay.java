package strings;
import java.util.Scanner;
public class CountAndSay {
	static Scanner sc=new Scanner(System.in);
	String str="";
	public static void main(String args[]) 
	{
		int n=sc.nextInt();
		String str=new String("1");
		String update=new String("");
		int count =1;
		int j=0;
		for(int i=1;i<n;i++) 
		{
			update="";
			for(j=0;j<str.length()-1;j++) 
			{
				if(str.charAt(j)==str.charAt(j+1)) 
				{
					count++;
				}
				else 
				{
					update=update+count+""+str.charAt(j);
					count=1;
				}
			}
			update=update+count+""+str.charAt(j);
			str=update;
			count=1;
		}
		System.out.println(str);
	}
}
