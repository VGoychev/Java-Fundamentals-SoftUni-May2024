package MethodsExercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        characterInRange(first,second);
    }
    static void characterInRange(char a, char b){
        if (a < b){
            for (int i = a + 1; i < b; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
