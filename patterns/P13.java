package patterns;
import java.util.*;
public class P13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print((char)(ch+j));
			}
			System.out.println();
		}
	}
}
