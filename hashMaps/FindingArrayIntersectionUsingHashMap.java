package hashMaps;
import java.util.*;

public class FindingArrayIntersectionUsingHashMap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Enter the size of the First array");
        int n = sc.nextInt();
        ArrayList<Integer> arr1 = create(n);
        print(arr1);

        System.out.println("Enter the Size of the Second array");
        int m = sc.nextInt();
        ArrayList<Integer> arr2 = create(m);
        print(arr2);

        ArrayList<Integer> arr = intersection(arr1, arr2);
        System.out.println("The Common Elements in the 2 arrays are");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : arr2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                arr.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }
        return arr;
    }
    private static void print(ArrayList<Integer> arr1) {
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
    }
    private static ArrayList<Integer> create(int n) {
        ArrayList<Integer> obj = new ArrayList<>();
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            obj.add(x);
        }
        return obj;
    }
}