package fundamentals;

public class P19 {
	public static void main(String args[]) 
	{
		int evensum=0;
		int oddsum=0;
		 int a=132456;
		 int i=0;
		 while(a!=0) 
		 {
			 int rem=a%10;
			 if(rem%2==0) 
			 {
				 evensum+=rem;
			 }
			 else 
			 {
				 oddsum+=rem;
			 }
			 a/=10;
		 }
		 System.out.println(evensum);
		 System.out.println(oddsum);
	}
}
