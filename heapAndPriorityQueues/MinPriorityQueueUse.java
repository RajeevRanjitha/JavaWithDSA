package heapAndPriorityQueues;
import java.util.Scanner;
public class MinPriorityQueueUse {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws EmptyException 
	{
		MinPriorityQueue<String> pq=new MinPriorityQueue<String>();
		pq.insert("Ranjitha", 90);
		pq.insert("Gayatri", 89);
		pq.insert("Amma", 99);
		pq.insert("Nanna", 100);
		pq.insert("Thammudu", 98);
		pq.insert("Santosh", 0);
		System.out.println("Priority Queue Before Removing ");
		pq.print();
		pq.removeMin();
		System.out.println();
		System.out.println("Priority Queue After removing ");
		pq.print();
	}
}
