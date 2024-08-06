package Queues;

public class ArrayQueueUse {
	public static void main(String args[]) throws EmptyException, FulLException 
	{
		ArrayQueue obj=new ArrayQueue(10);
		System.out.print(obj.isEmpty());
		obj.enqueue(56);
		obj.enqueue(45);
		obj.enqueue(34);
		obj.enqueue(90);
		System.out.println(obj.dequeue());
		System.out.println(obj.size());
		System.out.println(obj.front());
		System.out.print(obj.isEmpty());
	}
}
