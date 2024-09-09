package hashMapsHashMaps;

public class HahTableUse {
	public static void main(String args[]) 
	{
		HashTable<String,Integer> hashTable = new HashTable<>();
		hashTable.hashTableInsert1("Ranjitha", 4);
		hashTable.hashTableInsert1("Ranjitha", 90);
		hashTable.hashTableInsert1("RanjithaGayatri", 56);
		hashTable.hashTableInsert1("Ranjith", 4);
		hashTable.hashTableInsert1("RanjithaSantosh", 0);
		hashTable.removKey1("RanjithaSantosh");
		hashTable.print();
	}
}
