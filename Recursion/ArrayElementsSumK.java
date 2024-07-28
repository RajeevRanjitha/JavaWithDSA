package Recursion;
import java.util.Scanner;

public class ArrayElementsSumK {
    public static int[][] subsetsSumK(int[] input, int k) {
        return subsetsSumKHelper(input, k, 0);
    }
    private static int[][] subsetsSumKHelper(int[] input, int k, int startIndex) {
        if (startIndex == input.length) {
            return (k == 0) ? new int[][] { new int[0] } : new int[0][0];
        }
        int[][] subsetsWithCurrent = subsetsSumKHelper(input, k - input[startIndex], startIndex + 1);
        int[][] subsetsWithoutCurrent = subsetsSumKHelper(input, k, startIndex + 1);
        int[][] result = new int[subsetsWithCurrent.length + subsetsWithoutCurrent.length][];
        for (int i = 0; i < subsetsWithoutCurrent.length; i++) {
            result[i] = subsetsWithoutCurrent[i];
        }
        for (int i = 0; i < subsetsWithCurrent.length; i++) {
            result[i + subsetsWithoutCurrent.length] = new int[subsetsWithCurrent[i].length + 1];
            result[i + subsetsWithoutCurrent.length][0] = input[startIndex];
            System.arraycopy(subsetsWithCurrent[i], 0, result[i + subsetsWithoutCurrent.length], 1, subsetsWithCurrent[i].length);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the length of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Read the elements of the array
        int[] input = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        // Read the target sum k
        System.out.print("Enter the target sum k: ");
        int k = scanner.nextInt();

        // Find and print subsets
        int[][] subsets = subsetsSumK(input, k);

        System.out.println("Subsets that sum to " + k + ":");
        for (int[] subset : subsets) {
            System.out.print("[ ");
            for (int element : subset) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }

        scanner.close();
    }
}
