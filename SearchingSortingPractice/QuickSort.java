package SearchingSortingPractice;
import java.util.Scanner;
public class QuickSort
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void quickSort(int a[],int start,int end) 
	{
		if(start>=end) 
		{
			return;
		}
		int k=partition(a,start,end);
		quickSort(a,start,k-1);
		quickSort(a,k+1,end);
	}
	public static int partition(int a[],int start,int end) 
	{
		int pivot=a[start];
		int count =0;
		for(int i=start+1;i<=end;i++) 
		{
			if(pivot>a[i]) 
			{
				count++;
			}
		}
		int pivotIndex=start+count;
		int temp=a[start];
		a[start]=a[pivotIndex];
		a[pivotIndex]=temp;
		int i=start;
		int j=end;
		while(i<pivotIndex && j>pivotIndex) 
		{
			while(i<a[pivotIndex] && j>pivotIndex)
			{
				i++;
			}
			while(a[j]<a[pivotIndex]&& i<pivotIndex) 
			{
				j--;
			}
			int flag=a[i];
			a[i]=a[j];
			a[j]=flag;
		}
		return pivotIndex;
	}
}