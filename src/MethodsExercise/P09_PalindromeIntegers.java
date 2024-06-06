package MethodsExercise;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        palindromeInt(input);
    }
    static void palindromeInt(String number){
        while (!number.equals("END")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(number);
            stringBuilder.reverse();
            if (number.contentEquals(stringBuilder)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            number = scanner.nextLine();
        }
    }
}
