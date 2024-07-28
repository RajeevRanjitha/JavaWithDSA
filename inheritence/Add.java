package inheritence;
import java.util.Scanner;
public class Add extends Calculator{
	public Add(int a,int b) 
	{
		super(a,b);
	}
	static Scanner sc=new Scanner(System.in);
	public int add() 
	{
		return this.a+this.b;
	}
}
