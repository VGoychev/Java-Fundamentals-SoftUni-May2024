package TextProcessingExercise;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String encryptedText = encryptText(input);
        System.out.println(encryptedText);
    }

    private static String encryptText(String text) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char newChar = (char) (currentChar + 3);
            encrypted.append(newChar);
        }

        return encrypted.toString();
    }
}
