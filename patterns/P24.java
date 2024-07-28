package patterns;
import java.util.Scanner;
public class P24 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=n-i;j>0;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
			}
			for(int k=i-1;k>=1;k--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
