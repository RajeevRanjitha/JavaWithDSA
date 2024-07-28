package generics;
import java.util.Scanner;
public class MethodGenerics {
	public static <T extends Pair> void print(T arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i].getA());
		}
	}
	public static void main(String ars[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n=sc.nextInt();
		Integer a[]=new Integer[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
//		print(a);
//		String str[]=new String[n];
//		System.out.println("Enter the String array Elements");
//		for(int i=0;i<str.length;i++) 
//		{
//			str[i]=sc.next();
//		}
//		Pair<Integer> obj=new Pair<>();
//		print(str);
		Pair<Integer> p[]=new Pair[n];
		for(int i=0;i<p.length;i++) 
		{
			p[i]=new Pair<Integer>();
			p[i].setA(56);
		}
		System.out.println(p[0].getA());
		print(p);
		sc.close();
	}
}
