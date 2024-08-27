package fundamentals;
import java.util.Scanner;
public class PrintingTheMostRepeatingCharcterInTheString {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the String ");
		String str=sc.next();
		int arr[]=new int[256];
		int max=Integer.MIN_VALUE;
		int index=-1;
		for(int i=0;i<str.length();i++) 
		{
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>max) 
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println("The most repeating character is "+ (char)index);
	}
}
