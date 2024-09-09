package heapAndPriorityQueues;
import java.util.ArrayList;
public class MinPriorityQueue <T>{
	private ArrayList<Element<T>>heap;
	public MinPriorityQueue() {
        heap = new ArrayList<>();
    }
	public void insert(T key ,int val) 
	{
		Element<T>e=new Element<>(key,val);
		heap.add(e);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) 
		{
			if(heap.get(childIndex).val<heap.get(parentIndex).val) 
			{
				Element <T>x=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, x);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else 
			{
				return;
			}
		}
	}
	public T getMin() throws EmptyException
	{
		if(heap.size()==0) 
		{
			throw new EmptyException();
		}
		return heap.get(0).key;
	}
	public T removeMin() throws EmptyException
	{
		if(heap.size()==0) 
		{
			throw new EmptyException();
		}
		Element<T> temp=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex=0;
		int leftChildIndex=2*parentIndex+1;
		int rightChildIndex=2*parentIndex+2;
		int minIndex=parentIndex;
		while(leftChildIndex<heap.size()) 
		{
			if(heap.get(parentIndex).val>heap.get(leftChildIndex).val) 
			{
				minIndex=leftChildIndex;
			}
			if(rightChildIndex<heap.size() &&  heap.get(minIndex).val>heap.get(rightChildIndex).val) 
			{
				minIndex=rightChildIndex;
			}
			if(minIndex==parentIndex) 
			{
				break;
			}
			Element <T> flag= heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, flag);
			parentIndex=minIndex;
			leftChildIndex=2*parentIndex+1;
			rightChildIndex=2*parentIndex+2;
		}
		return temp.key;
	}
	public int size() 
	{
		return heap.size();
	}
	public boolean isEmpty() 
	{
		return heap.size()==0;
	}
	public void print() 
	{
		printLevelWise(heap);
	}
	private void printLevelWise(ArrayList<Element<T>> heap2) 
	{
		for(int i=0;i<heap2.size()-1;i++)
		{
			System.out.println(heap2.get(i).key+":"+heap2.get(i).val);
		}
	}
}
