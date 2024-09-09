package heapAndPriorityQueues;
import java.util.ArrayList;
public class MaxPriorityQueue <T>{
	ArrayList<Element<T>>heap;
	public MaxPriorityQueue() 
	{
		heap=new ArrayList<>();
	}
	public void insert(T key, int val) 
	{
		Element<T> e=new Element<>(key,val);
		heap.add(e);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) 
		{
			if(heap.get(parentIndex).val<heap.get(childIndex).val) 
			{
				Element<T> flag=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, flag);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else 
			{
				return;
			}
		}
	}
	public int getSize() 
	{
		return heap.size();
	}
	public boolean isEmpty() 
	{
		return heap.size()==0;
	}
	public T getMax() throws EmptyException
	{
		if(heap.size()==0) 
		{
			throw new EmptyException();
		}
		return heap.get(0).key;
	}
	public T removeMax() throws EmptyException
	{
		if(heap.size()==0) 
		{
			throw new EmptyException();
		}
		Element<T>flag=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex=0;
		int leftchildIndex=2*parentIndex+1;
		int rightChildIndex=2*parentIndex+2;
		int maxIndex=parentIndex;
		while(leftchildIndex <heap.size()) 
		{
			if(heap.get(leftchildIndex).val>heap.get(parentIndex).val) 
			{
				maxIndex=leftchildIndex;
			}
			if(rightChildIndex<heap.size() && heap.get(rightChildIndex).val>heap.get(maxIndex).val) 
			{
				maxIndex=rightChildIndex;
			}
			if(maxIndex==parentIndex)
			{
				break;
			}
			Element<T> temp=heap.get(maxIndex);
			heap.set(maxIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			parentIndex=maxIndex;
			leftchildIndex=2*parentIndex+1;
			rightChildIndex=2*parentIndex+2;
		}
		return flag.key;
	}
}
