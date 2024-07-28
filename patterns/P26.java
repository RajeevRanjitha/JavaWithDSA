package patterns;
import java.util.Scanner;
public class P26 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			int a=n;
			for(int j=0;j<n;j++) 
			{
				if((i+j)<(n-1)) 
				{
					System.out.print(a);
					a--;
				}
				else if((i+j)==(n-1)) 
				{
					System.out.print("*");
					a--;
				}
				else 
				{
					System.out.print(a);
					a--;
				}
			}
			System.out.println();
		}
	}
}
