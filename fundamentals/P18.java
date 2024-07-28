package fundamentals;
import java.util.Scanner;
public class P18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90) 
		{
			System.out.println(1);
		}
		else if(ch>=97 && ch<=112) 
		{
			System.out.println(0);
		}
		else 
		{
			System.out.println(-1);
		}
	}
}
