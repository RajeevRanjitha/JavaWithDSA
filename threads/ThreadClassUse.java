package threads;

public class ThreadClassUse {
	public static void main(String arg[]) {
	ThreadClass t=new ThreadClass();
	t.start();
	int i=1;
	while(true) 
		{
			System.out.println(i+"World");
			i++;
		}
	}
}
