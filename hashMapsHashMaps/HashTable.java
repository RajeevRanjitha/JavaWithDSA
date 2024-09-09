package hashMapsHashMaps;
import java.util.ArrayList;
public class HashTable <K,V>{
	ArrayList<Map<K,V>> arr=new ArrayList<Map<K,V>>();
	int count ;
	int noOfBuckets;
	HashTable()
	{
		count =0;
		noOfBuckets=20;
		for(int i=0;i<20;i++) 
		{
			arr.add(null);
		}
	}
	public int getIndex(K key) 
	{
		return Math.abs(key.hashCode());
	}
	//Insertion at the Rear Part Method1
	public void hashTableInsert1(K key,V val) 
	{
		int index=getIndex(key)%arr.size();
		Map<K,V> node=new Map<>(key,val);
		if(arr.get(index)==null) 
		{
			arr.set(index, node);
		}
		else 
		{
			Map<K,V> p=arr.get(index);
			while(p.next!=null) 
			{
				if(p.key.equals(node.key)) 
				{
					p.val=node.val;
					return;
				}
				p=p.next;
			}
			if(p.key.equals(node.key)) 
			{
				p.val=node.val;
				return;
			}
			else 
			{
				p.next=node;
			}
		}
		count++;
	}
	//Insertion at the Front Part Method 2
	public void hashTableInsert2(K key,V val) 
	{
		int index=getIndex(key)%arr.size();
		Map<K,V> node=new Map<>(key,val);
		if(arr.get(index)==null) 
		{
			arr.set(index, node);
		}
		else 
		{
			Map<K,V> p=arr.get(index);
			while(p.next!=null) 
			{
				if(p.key.equals(node.key)) 
				{
					p.val=node.val;
					return;
				}
				p=p.next;
			}
			if(p.key.equals(node.key)) 
			{
				p.val=node.val;
				return;
			}
			else 
			{
				node.next=arr.get(index);
				arr.set(index, node);
			}
		}
		count++;
		double loadFactor=(1.0)*count/noOfBuckets;
		if(loadFactor>0.7) 
		{
			reHash();
		}
	}
	public int size() 
	{
		return count;
	}
	public V getValue(K key) 
	{
		int index=getIndex(key)%arr.size();
		Map<K,V>p=arr.get(index);
		while(p!=null) 
		{
			if(p.key.equals(key)) 
			{
				return p.val;
			}
			p=p.next;
		}
		return null;
	}
	public void search(ArrayList<Map<K,V>>arr,K key) 
	{
		int index=getIndex(key)%arr.size();
		Map<K,V>p=arr.get(index);
		while(p!=null) 
		{
			if(p.key.equals(key)) 
			{
				System.out.println("Key Found and its Corresponding Val is "+p.val);
				return;
			}
			p=p.next;
		}
		System.out.println("Not Found");
	}
	public void removKey1(K key) 
	{
		int index=getIndex(key)%arr.size();
		Map<K,V>prev=null,p=arr.get(index);
		while(p!=null) 
		{
			if(p.key.equals(key)) 
			{
				break;
			}
			prev=p;
			p=p.next;
		}
		if(p==null) 
		{
			return;
		}
		if(prev==null) 
		{
			if(p.key.equals(key)) 
			{
				arr.set(index,null);
				count--;
			}
		}
		else 
		{
			prev.next=p.next;
			count--;
		}
	}
	public void removeKey(K key) 
	{
		int index=getIndex(key)%arr.size();
		Map<K,V>p=arr.get(index);
		if(p==null) 
		{
			return ;
		}
		else if(p.next==null ) 
		{
			if(p.key.equals(key)) 
			{
				p=null;
				count--;
				arr.set(index,null);
				return;
			}
		}
		else if(p.next.next==null) 
		{
			if(p.key.equals(key)) 
			{
				p=p.next;
				arr.set(index,p);
				count--;
				return;
			}
			else if(p.next.key.equals(key)) 
			{
				p.next=null;
				count--;
				return;
			}
		}
		else 
		{
			while(p.next.next!=null) 
			{
				if(p.next.key.equals(key)) 
				{
					p.next=p.next.next;
					count--;
					return;
				}
			}
		}
	}
	public void print() 
	{
		print(arr);
	}
	public void reHash() 
	{
		ArrayList<Map<K,V>>temp=arr;
		arr=new ArrayList<>();
		noOfBuckets=2*noOfBuckets;
		count =0;
		for(int i=0;i<noOfBuckets;i++) 
		{
			arr.add(null);
		}
		for(int i=0;i<temp.size();i++) 
		{
			Map<K,V>p=temp.get(i);
			while(p!=null) 
			{
				hashTableInsert2(p.key,p.val);
			}
		}
	}
	private void print(ArrayList<Map<K,V>> arr) 
	{
		for(int i=0;i<arr.size();i++) 
		{
			Map<K,V> p=arr.get(i);
			while(p!=null) 
			{
				System.out.println(p.key+":"+p.val+" ");
				p=p.next;
			}
		}
	}
}