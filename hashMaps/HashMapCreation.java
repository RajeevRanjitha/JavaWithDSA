package hashMaps;
public class HashMapCreation <S,T>{
	private LinkedListForHashMap<S,T>head=null;
	public void insert(S key,T val) 
	{
		if(head==null) 
		{
			S k=key;
			T v=val;
			LinkedListForHashMap<S,T>node=new LinkedListForHashMap<>(k,v);
			head=node;
		}
		
		else 
		{
			S k=key;
			T v=val;
			LinkedListForHashMap<S,T>p=head;
			boolean flag=true;
			while(p!=null) 
			{
				if(p.key.equals(k)) 
				{
					p.val=v;
					flag=false;
					break;
				}
				p=p.next;
			}
			if(flag) 
			{
				LinkedListForHashMap<S,T>node=new LinkedListForHashMap<>(k,v);
				node.next=head;
				head=node;
			}
		}
	}
	public LinkedListForHashMap<S,T> delete(LinkedListForHashMap<S,T>head,S key) throws HashMapEmptyException 
	{
		LinkedListForHashMap<S,T>p=head;
		if(head==null) 
		{
			throw new HashMapEmptyException("HashMapIsEmpty");
		}
		if (head.key.equals(key)) {
            LinkedListForHashMap<S, T> temp = head;
            head = head.next; 
            return temp;
        }
		while(p.next!=null) 
		{
			if(p.next.key.equals(key)) 
			{
				LinkedListForHashMap<S,T>temp=p.next;
				p.next=p.next.next;
				return temp;
			}
			else 
			{
				p=p.next;
			}
		}
		return null;
	}
	public void delete(S key) throws HashMapEmptyException {
		LinkedListForHashMap<S,T> temp=delete(head,key);
		if(temp==null) 
		{
			System.out.print("Element not Found");
		}
		else 
		{
			System.out.println("Element Successfully deleted and the value is +"+temp.key+":"+temp.val);
		}
	}
}