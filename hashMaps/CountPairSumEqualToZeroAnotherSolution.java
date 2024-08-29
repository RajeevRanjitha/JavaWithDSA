package hashMaps;
import java.util.*;
public class CountPairSumEqualToZeroAnotherSolution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countZeroSumPairs(arr));
    }

    public static int countZeroSumPairs(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int count = 0;
        for (int num : frequencyMap.keySet()) {
            if (num < 0 && frequencyMap.containsKey(-num)) {
                count += frequencyMap.get(num) * frequencyMap.get(-num);
            }
        }
        return count;
    }
}
