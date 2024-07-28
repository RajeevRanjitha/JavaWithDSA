package strings;
import java.util.Scanner;
public class P3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String arg[]) 
	{
		String str="Ranjitha Gayatri";
		String str2="Rajeev";
		System.out.println(str.toCharArray());
		System.out.print(str.charAt(0));
		System.out.println(str.compareTo(str2));;
		System.out.println(str.equals(str2));
		System.out.println(str.length());
		System.out.println(str.concat("Hi"));
		System.out.println(str.contains(" "));
		System.out.println(str.split(" "));
		int n[]=new int [5];
		String []arr=new String[5];
		arr[0]="Ranjitha";
	}
}
