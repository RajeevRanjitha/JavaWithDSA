package threads;

public class RunnableInterFace implements Runnable{
	public void run() 
	{
		int i=1;
		while(true) 
		{
			System.out.println(i+"Hello");
			i++;
		}
	}
	public static void main(String args[]) 
	{
		RunnableInterFace obj=new RunnableInterFace();
		Thread t=new Thread(obj);
		t.start();
		int i=1;
		while(true) 
		{
			System.out.println(i+"World");
			i++;
		}
	}
}
