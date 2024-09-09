package hashMapsHashMaps;

public class Map <K,V>{
	K key;
	V val;
	Map<K,V> next;
	public Map(K key,V val)
	{
		this.key=key;
		this.val=val;
		this.next=null;
	}
}
