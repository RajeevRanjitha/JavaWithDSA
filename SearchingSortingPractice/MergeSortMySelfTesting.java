package SearchingSortingPractice;
import java.util.Scanner;
public class MergeSortMySelfTesting {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) 
	{
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements of the  of the array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void mergeSort(int a[],int start,int end) 
	{
		if(start==end) 
		{
			return; 
		}
		int mid=(start+end)/2;
		mergeSort(a,start,mid);
		mergeSort(a,mid+1,end);
		merge(a,start,mid,end);
	}
	public static void merge(int a[],int start,int mid,int end) 
	{
		int left[]=new int[mid-start+1];
		int right[]=new int[end-mid];
		for(int i=0;i<left.length;i++) 
		{
			left[i]=a[start+i];
		}
		for(int j=0;j<right.length;j++) 
		{
			right[j]=a[mid+j+1];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<left.length && j<right.length) 
		{
			if(left[i]<right[j])
			{
				a[k]=left[i];
				k++;
				i++;
			}
			else 
			{
				a[k]=right[j];
				k++;
				j++;
			}
		}
		while(i!=left.length) 
		{
			a[k]=left[i];
			k++;
			i++;
		}
		while(j!=right.length) 
		{
			a[k]=right[j];
			k++;
			j++;
		}
	}
}
