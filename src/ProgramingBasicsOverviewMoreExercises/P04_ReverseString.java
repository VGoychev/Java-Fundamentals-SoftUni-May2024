package ProgramingBasicsOverviewMoreExercises;

import java.util.Scanner;

public class P04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverse = "";
        for (int position = input.length() - 1; position >= 0; position--) {
            char symbol = input.charAt(position);
            reverse += symbol;
        }
        System.out.println(reverse);
    }
}
