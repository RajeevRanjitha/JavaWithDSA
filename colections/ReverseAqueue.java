package colections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ReverseAqueue {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the number of Elemnts you want to insert intially");
		int n=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<n;i++) 
		{
			int val=sc.nextInt();
			q.add(val);
		}
		System.out.println("Queue Before Reversal");
		print(q);
		reverse(q);
		System.out.println("q after reversal");
		print(q);
	}
	private static void print(Queue<Integer> q) {
		for(Integer elem:q) 
		{
			System.out.println(elem);
		}
	}
	private static void reverse(Queue<Integer> q) {
		if(q.isEmpty()) 
		{
			return;
		}
		int temp=q.poll();
		reverse(q);
		q.add(temp);
	}
}
