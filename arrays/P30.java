package arrays;
import java.util.Scanner;
public class P30 {
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
		System.out.println("Enter \"rightrotate\" or \"leftrotate\"");
		String str=sc.next();
		switch(str) 
		{
		case "rightrotate":rightrotate(a);
		System.out.println("The array After right rotation is ");
		print(a);
		break;
		case "leftrotate" :leftrotate(a);
		System.out.println("The array after left rotation is ");
		print(a);
		break;
		default :System.out.println("Enter a valid input");
		}
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
public static void leftrotate(int a[]) 
 	{
	System.out.println("enter the position you want to shift");
	int x=sc.nextInt();
	rotate(a);
	rotate(a,0,a.length-x-1);
	rotate(a,a.length-x,a.length-1);
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
