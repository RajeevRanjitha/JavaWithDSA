package Recursion;
import java.util.Scanner;
public class ReplacePi {
   static Scanner sc=new Scanner(System.in);
   public static void main(String args[]) 
   {
	   System.out.println("Enter the string");
	   String str1=sc.next();
	   StringBuffer str=new StringBuffer(str1);
	  System.out.println(replacePi(str,0));
   }
   public static StringBuffer replacePi(StringBuffer str,int i) 
   {
	   if(i>=str.length()-1) 
	   {
		   return str;
	   }
	   if(str.substring(i,i+2).equals("pi")) 
	   {
		   str.replace(i, i+2, "3.14");
		   replacePi(str,i+2);
	   }
	   return replacePi(str,i+1);
   }
}
