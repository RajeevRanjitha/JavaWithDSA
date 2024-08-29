package hashMaps;

public class LinkedListForHashMap<S,T> {
	S key;
	T val;
	LinkedListForHashMap<S,T>next;
	public LinkedListForHashMap(S key, T val) 
	{
		this.key=key;
		this.val=val;
	}
}
