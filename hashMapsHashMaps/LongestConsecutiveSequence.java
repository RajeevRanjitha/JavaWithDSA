package hashMapsHashMaps;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Collections;
public class LongestConsecutiveSequence {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Enter the number of random numbers you want ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			arr.add((int) (Math.random()*100));
		}
		HashMap<Integer,Boolean>obj=new HashMap<>();
		Collections.sort(arr);
		for(int x:arr) 
		{
			obj.put(x, true);
		}
		int highstart=0;
		int highend=0;
		int length=0;
		for(int i=0;i<obj.size();i++) 
		{
			int count =0;
			int start=arr.get(i);
			
		}
	}
}
