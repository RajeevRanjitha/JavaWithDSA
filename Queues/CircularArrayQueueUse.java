package Queues;

public class CircularArrayQueueUse {
	public static void main(String args[]) throws FulLException, EmptyException 
	{
		CircularArrayQueue obj=new CircularArrayQueue();
		obj.enqueue(45);
		obj.enqueue(56);
		obj.enqueue(89);
		obj.enqueue(90);
		System.out.println(obj.dequeue());
		System.out.println(obj.front());
	}
}
