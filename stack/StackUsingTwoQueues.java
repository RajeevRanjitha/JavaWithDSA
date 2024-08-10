package stack;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueues {
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue <Integer>q2=new LinkedList<Integer>();
	public void push(int val) 
	{
		if(q1.isEmpty()) 
		{
			q1.add(val);
		}
		else 
		{
			q2.add(val);
			while(!(q1.isEmpty())) 
			{
				q2.add(q1.poll());
			}
			Queue<Integer> temp=q1;
			q1=q2;
			q2=temp;
		}
	}
	public int  pop() 
	{
		int temp=q1.peek();
		q1.poll();
		return temp;
	}
	public static void main(String args[]) 
	{
		StackUsingTwoQueues stack=new StackUsingTwoQueues();
	}
}
