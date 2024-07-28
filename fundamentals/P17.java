package fundamentals;
import java.util.*;
public class P17 {
	public static void main(String args[]) 
	{
		Integer myint=1;
		Float myfloat=1.24f;
		String str=myfloat.toString();
		System.out.println();
		System.out.println();
		System.out.println(str.length());
		char []ch=str.toCharArray();
		System.out.println();
		System.out.println();
		for(char a:ch) 
		{
			System.out.println(a);
		}
	}
}
