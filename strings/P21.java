package strings;
import java.util.Scanner;
public class P21 {
	static Scanner sc=new Scanner(System.in) ;
	public static void main(String args[])
	{
		String str=sc.next();
		String update="";
		int count =1;
		int i=0;
		for(i=0;i<str.length()-1;i++) 
		{
			if(str.charAt(i)!=str.charAt(i+1)) 
			{
				if(count==1) 
				{
					update=update+str.charAt(i);
					count=0;
				}
				else 
				{
					update=update+str.charAt(i)+count;
					count =0;
				}
			}
			count++;
		}
		if(str.charAt(i)!=str.charAt(i-1)) 
		{
			if(count==1) 
			{
				update=update+str.charAt(i);
			}
			else 
			{
				update=update+str.charAt(i)+1;
			}
		}
		else 
		{
			if(count==1) {
				update=update+str.charAt(i);
			}
			else 
			{
				update=update+str.charAt(i)+(count);
			}
		}
		System.out.println(update);
	}
}
