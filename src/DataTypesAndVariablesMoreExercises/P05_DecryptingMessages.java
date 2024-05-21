package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class P05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        String word = "";
        for (int i = 1; i <= lines; i++) {
            char character = scanner.nextLine().charAt(0);
            character += key;
            word += character;
        }
        System.out.printf("%s%n", word);
    }
}
