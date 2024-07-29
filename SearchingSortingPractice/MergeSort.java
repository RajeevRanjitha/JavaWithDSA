package SearchingSortingPractice;
import java.util.Scanner;
public class MergeSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String ags[]) {
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, a.length - 1);
        System.out.println("Sorted array:");
        print(a);
    }
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void mergeSort(int a[], int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(a, start, mid);
        mergeSort(a, mid + 1, end);
        //Note the the left and right arrays are merged in the original array......
        merge(a, start, mid, end);
    }
    public static void merge(int a[], int start,int mid,int end) {
       int left[]=new int[mid-start+1];
       for(int i=0;i<left.length;i++) 
       {
    	   left[i]=a[start+i];
       }
       
       int right[]=new int[end-mid];
       for(int j=0;j<right.length;j++) 
       {
    	   right[j]=a[mid+j+1];
       }
       int i=0;
       int j=0;
       int k=start;
       while(i!=left.length && j!=right.length) 
       {
    	   if(left[i]<right[j]) 
    	   {
    		   a[k]=left[i];
    		   i++;
    		   k++;
    	   }
    	   else 
    	   {
    		   a[k]=right[j];
    		   j++;
    		   k++;
    	   }
       }
       while(i!=left.length) 
       {
    	   a[k]=left[i];
    	   i++;
    	   k++;
       }
       while(j!=right.length) 
       {
    	   a[k]=right[j];
    	   j++;
    	   k++;
       }
    }
}
