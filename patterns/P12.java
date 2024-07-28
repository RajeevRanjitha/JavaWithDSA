package patterns;
import java.util.*;
public class P12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='A';
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
	}
}
