package practiceAccenture;
import java.util.Scanner;
public class P1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of Houses");
		int n=sc.nextInt();
	
		int a[]=new int[n];
		System.out.println("Enter the amount of food present in each hous");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of rats present in your area");
		int r=sc.nextInt();
		System.out.println("Enter the food consumes by each rat");
		int unit=sc.nextInt();
		System.out.println(function(r,unit,a));
	}
	public static int function(int r,int unit,int arr[]) 
	{
		int foodrequired=unit*r;
		int count =1;
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{
			sum+=arr[i];
			if(sum<foodrequired) 
			{
				count++;
			}
		}
		return count;
	}
}
