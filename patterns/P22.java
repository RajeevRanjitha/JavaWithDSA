package patterns;
import java.util.Scanner;
public class P22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) 
	{
		int a=1;
		for(int j=1;j<=n;j++) 
		{
			if(i+j<=n) 
			{
				System.out.print(" ");
			}
			else 
			{
				System.out.print(a);
				a++;
			}
		}
		System.out.println();
	}
}
}
