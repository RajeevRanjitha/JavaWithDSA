package patterns;
import java.util.*;
public class P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			for(int j=4;j>=1;j--) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
