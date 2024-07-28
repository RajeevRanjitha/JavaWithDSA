package Recursion;

import java.util.Scanner;

public class CharacterMappingStringtoNumber {

    // Return a string array that contains all possible codes
    public static String[] getCode(String input) {
        if (input.length() == 0) {
            String ans[] = {""};
            return ans;
        }

        // Single character case
        String[] smallAns1 = getCode(input.substring(1));
        char firstChar = (char)((input.charAt(0) - '0' + 'a' - 1));
        for (int i = 0; i < smallAns1.length; i++) {
            smallAns1[i] = firstChar + smallAns1[i];
        }

        // Check validity of the first two characters
        String[] smallAns2 = new String[0];
        if (input.length() >= 2) {
            int firstTwoNum = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if (firstTwoNum >= 10 && firstTwoNum <= 26) {
                char firstTwoChar = (char)(firstTwoNum + 'a' - 1);
                smallAns2 = getCode(input.substring(2));
                for (int i = 0; i < smallAns2.length; i++) {
                    smallAns2[i] = firstTwoChar + smallAns2[i];
                }
            }
        }

        // Combine smallAns1 and smallAns2
        String[] ans = new String[smallAns1.length + smallAns2.length];
        for (int i = 0; i < smallAns1.length; i++) {
            ans[i] = smallAns1[i];
        }
        for (int i = smallAns1.length; i < ans.length; i++) {
            ans[i] = smallAns2[i - smallAns1.length];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numeric string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] result = getCode(input);
        System.out.println("Possible codes:");
        for (String code : result) {
            System.out.println(code);
        }
    }
}
