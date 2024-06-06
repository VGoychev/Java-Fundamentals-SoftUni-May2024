package MethodsExercise;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleChar(input);
    }

    static void middleChar(String word){
        if (word.length()%2 == 0){
            String result = "";
            char symbol2 = word.charAt(word.length()/2-1);
            result += symbol2;
            char symbol = word.charAt(word.length()/2);
            result += symbol;
            System.out.println(result);
        } else if (word.length()%2 == 1){
            char symbol = word.charAt(word.length()/2);
            System.out.println(symbol);
        }
    }
}
