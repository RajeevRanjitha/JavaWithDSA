package fundamentals;
import java.util.Scanner;
public class PrintingTheMostRepeatingWord {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		String maxword=arr[0];
		int maxcount=0;
		for(int i=0;i<arr.length;i++) 
		{
			int count=0;
			String word=arr[i];
			for(int j=0;j<arr.length;j++) 
			{
				if(word.equals(arr[j]))
				{
					count++;
				}
			}
			if(count>maxcount) 
			{
				maxcount=count;
				maxword=word;
			}
		}
		System.out.println("The most repeating character is "+ maxword+" and the count is "+maxcount);
		sc.close();
	}
}
