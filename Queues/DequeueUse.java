package Queues;

public class DequeueUse {
	public static void main(String args[]) throws EmptyException 
	{
		Dequeue<String>dbq=new Dequeue<>();
		dbq.insertRear("Ranjitha");
		dbq.insertFront("Gayatri");
		dbq.insertFront("Rajeev");
		dbq.insertFront("Venkata");
		dbq.insertRear("Duppatla");
		dbq.print();
		dbq.deletefront();
		dbq.deleterear();
		dbq.deleterear();
		dbq.deleterear();
		dbq.deleterear();
		dbq.deleterear();
		dbq.print();
	}
}
