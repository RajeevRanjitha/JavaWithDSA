package patterns;
import java.util.Scanner;
public class P25 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=n-i;j>0;j--) 
			{
				System.out.print(" ");
			}
			for(int k=i;k<=(2*i-1);k++) 
			{
				System.out.print(k);
			}
			for(int k=i-1;k>=1;k--) 
			{
				System.out.print(k);
			}
			System.out.println();
		}
		    int a=5;
		    a+=5+(a++)+(++a);
		    System.out.print(a);
		    
	}
}
//Meet you soon
