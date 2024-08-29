package hashMaps;
import java.util.*;
public class CountPairSum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++) 
		{
			int x=sc.nextInt();
			arr.add(x);
		}
		int count =0;
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr.get(i)+arr.get(j)==0) 
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
