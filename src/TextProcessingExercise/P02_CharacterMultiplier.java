package TextProcessingExercise;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];

        int result = sumOfChars(first, second);
        System.out.println(result);
    }

    private static int sumOfChars(String first, String second){
        int sum = 0;
        int minLength = Math.min(first.length(), second.length());

        for (int i = 0; i < minLength; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }

        if (first.length() > second.length()){
            for (int i = minLength; i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = minLength; i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }
        return sum;
    }
}
