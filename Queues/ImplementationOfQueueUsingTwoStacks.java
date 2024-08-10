package Queues;
import java.util.Stack;
public class ImplementationOfQueueUsingTwoStacks {
		Stack<Integer> stack1=new Stack<>();
		Stack<Integer>stack2=new Stack<>();
		public void insert(int x) 
		{
			stack1.add(x);
		}
		public int front() 
		{
			while(!(stack1.isEmpty())) 
			{
				stack2.add(stack1.pop());
			}
			int temp=stack2.pop();
			stack2.add(temp);
			while(!(stack2.isEmpty())) 
			{
				stack1.add(stack2.pop());
			}
			return temp;
		}
		public int pop() 
		{
			while(!(stack1.isEmpty())) 
			{
				stack2.add(stack1.pop());
			}
			int temp=stack2.pop();
			while(!(stack2.isEmpty())) 
			{
				stack1.add(stack2.pop());
			}
			return temp;
		}
		public int size() 
		{
			return stack1.size();
		}
		public boolean isEmpty() 
		{
			return stack1.size()==0;
		}
		public static void main(String args[]) 
		{
			ImplementationOfQueueUsingTwoStacks queue=new ImplementationOfQueueUsingTwoStacks ();
			System.out.println(queue.size());
			queue.insert(45);
			queue.insert(90);
			queue.insert(34);
			System.out.println(queue.pop());
			System.out.println(queue.size());
			System.out.println(queue.isEmpty());
			System.out.println(queue.front());
		}
}
