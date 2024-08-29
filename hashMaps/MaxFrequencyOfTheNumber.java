package hashMaps;
import java.util.ArrayList;
import java.util.HashMap;
public class MaxFrequencyOfTheNumber {
	public static void main(String args[]) 
	{
		ArrayList <Integer>arr=new ArrayList<Integer>();
		for(int i=0;i<7;i++) 
		{
			arr.add(i);
			arr.add(i+1);
			arr.add(i+2);
		}
		int max=maxFrequency((arr));
		System.out.println("The maximum repeated Element is "+ max);
	}

	private static int maxFrequency(ArrayList<Integer> arrayList) {
		HashMap<Integer,Integer>maxMap =new HashMap<>();
		for(int i=0;i<arrayList.size();i++) 
		{
			if(maxMap.containsKey(arrayList.get(i))) 
			{
				maxMap.put(arrayList.get(i),maxMap.get(arrayList.get(i))+1 );
			}
			else 
			{
				maxMap.put(arrayList.get(i), 1);
			}
		}
		int maxFrequency = 0;
        int maxElement = -1;

        for (int key : maxMap.keySet()) {
            if (maxMap.get(key) > maxFrequency) {
                maxFrequency = maxMap.get(key);
                maxElement = key;
            }
        }

        return maxElement;
	}
}
