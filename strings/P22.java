package strings;
import java.util.Scanner;
public class P22 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in); 
		String str=new String("Ranjitha Gayatri");
		System.out.println(str.trim());
		System.out.println(str.compareTo("Ranj"));
		System.out.print(str.strip());
		System.out.println(str.replace("ran", "raj"));
		String str2[]=str.split(" ");
		for(int i=0;i<str2.length;i++) 
		{
			System.out.println(str2[i]);
		}
		char a[]=str.toCharArray();
		System.out.println(a);
		System.out.println(str.equals("Ranjitha Gayatri"));
		System.out.println(str.startsWith("Ra"));
	}
}
