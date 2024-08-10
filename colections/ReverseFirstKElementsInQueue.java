package colections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class ReverseFirstKElementsInQueue {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		Queue<Integer>q=new LinkedList<Integer>();
		System.out.println("Enter the number of Elements you want to insert into queue Intially");
		int n=sc.nextInt();
		System.out.println("Enter the values of the queue");
		for(int i=0;i<n;i++) 
		{
			int val=sc.nextInt();
			q.add(val);
		}
		System.out.println("Enter the number of Elements you want to reverse");
		int k=sc.nextInt();
		Queue<Integer>newq=new LinkedList<Integer>();
		newq=reverse(q,k,k+1,newq);
		while(!q.isEmpty()) 
		{
			newq.add(q.poll());
		}
		for(Integer val:newq) 
		{
			System.out.println(val+" ");
		}
	}
	private static Queue<Integer> reverse(Queue<Integer> q,int n,int m,Queue<Integer> newq) {
			if(n==0 || q.isEmpty()) 
			{
				return newq;
			}
			int temp=q.poll();
			reverse(q,n-1,m,newq);
			newq.add(temp);
			return newq;

	}
	
}
