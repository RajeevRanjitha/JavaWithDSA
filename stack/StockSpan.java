package stack;
public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] spans = new int[n];
        int[] stack = new int[n];
        int top = -1; 
        for (int i = 0; i < n; i++) {
            while (top >= 0 && prices[stack[top]] <= prices[i]) {
                top--;
            }
            spans[i] = (top == -1) ? (i + 1) : (i - stack[top]);
            stack[++top] = i;
        }
        return spans;
    }
    public static void main(String[] args) {
        int[] prices1 = {100, 89, 60, 70, 60, 85, 65};
        int[] spans1 = calculateSpan(prices1);
        System.out.println("Sample Output 1:");
        for (int span : spans1) {
            System.out.print(span + " ");
        }
        System.out.println();

        int[] prices2 = {60, 70, 80, 100, 90, 75, 80, 120};
        int[] spans2 = calculateSpan(prices2);
        System.out.println("Sample Output 2:");
        for (int span : spans2) {
            System.out.print(span + " ");
        }
    }
}