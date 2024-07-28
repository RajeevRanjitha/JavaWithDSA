package exceptions;
public class P2 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Inside finally block");
            // Code that will always execute, regardless of whether an exception occurs or not
            cleanup();
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This will cause an ArithmeticException if b is 0
    }

    public static void cleanup() {
        System.out.println("Performing cleanup tasks");
    }
}
