package strings;
import java.util.Scanner;
public class P1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		String str="Ranjitha Gayatri";
		StringBuffer str1=new StringBuffer("Ranjiha");
		for(int i=0;i<str.length();i++) 
		{
			System.out.println(str.charAt(i)+" ");
		}
		str1.append("Rajeev");
		System.out.println(str1.toString() instanceof String);
	}
}