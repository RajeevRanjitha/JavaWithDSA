package strings;
import java.util.Scanner;
public class P16 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()!=str2.length()) 
		{
			System.out.println("Not permuted");
		}
		else 
		{
			boolean val=true;
			for(int i=0;i<=str1.length()-1;i++) 
			{
				char ch=str1.charAt(i);
				if(!(str1.contains(str2.substring(i,i+1)) && str2.contains(str1.substring(i,i+1)))) 
				{
					val=false;
					break;
				}		
			}
			if(val) 
			{
				System.out.println("Permutated");
			}
			else 
			{
				System.out.println("not permutated");
			}
		}
	}
}
