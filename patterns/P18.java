package patterns;
import java.util.Scanner;
public class P18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch=(char)('A'+n-1);
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print((char)(ch+j));
			}
			ch--;
			System.out.println();
		}
	}
}
