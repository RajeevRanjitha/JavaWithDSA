//Note :Here the array entered should be in the increasing order;
package arrays;
import java.util.Scanner;
public class P31 {
static Scanner sc=new Scanner(System.in);
public static void main(String args[])
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the Elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The entered array you entered is ");
		print(a);
		rightrotate(a);
		System.out.println("The array After right rotation is ");
		print(a);
		System.out.println("This Program is to now how much value  Shift it is Happened");
		int count =0;
		for(int i=0;i<a.length;i++) 
		{
			count++;
			if(a[i]>a[i+1]) {
				break;
			}
		}
		System.out.println("The shift you entered is  "+count);
	}
public static void print(int a[]) 
	{
	System.out.println();
	for(int i=0;i<a.length;i++) 
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
public static void rightrotate(int a[])
		{
		System.out.println("enter the position oyu want to shift");
		int x=sc.nextInt();
		rotate(a);
		rotate(a,0,x-1);
		rotate(a,x,a.length-1);
		print(a);
		}
public static void rotate(int a[]) 
	{
		int i=0;
		int j=a.length-1;
		while(i<=j) 
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
public static void rotate(int a[],int m,int n) 
{
	while(m<=n) 
	{
		int temp=a[m];
		a[m]=a[n];
		a[n]=temp;
		m++;
		n--;
	}
}
}
