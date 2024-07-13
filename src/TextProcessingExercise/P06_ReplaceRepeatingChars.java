package TextProcessingExercise;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = removeDuplicates(input);

        System.out.println(result);
    }

    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);
            if (currentChar != previousChar) {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
