package patterns;
import java.util.*;
public class P10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			int b=n;
			for(int j=0;j<=i;j++) 
			{
				System.out.print(b);
				b--;
			}
			System.out.println();
		}
	}
}
