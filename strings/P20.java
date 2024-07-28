package strings;
import java.util.Scanner;
public class P20 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		char ch=' ';
		int count =0;
		String str=sc.next();
		int a[]=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++) 
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
					count ++;
				}
			}
			a[i]=count;
			count =0;
		}
		int max=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>a[max]) 
			{
				max=i;
			}
		}
		System.out.println("The most repeating character in the Give String is "+str.charAt(max));
	}
}
