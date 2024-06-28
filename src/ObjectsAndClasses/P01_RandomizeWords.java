package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = rnd.nextInt(words.length);
            String firstWord = words[pos1];
            String secondWord = words[pos2];
            words[pos1] = secondWord;
            words[pos2] = firstWord;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
