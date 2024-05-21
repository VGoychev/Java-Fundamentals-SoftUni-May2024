package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class P01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
            Scanner commandType = new Scanner(input);
            if (commandType.hasNextInt()) {
                System.out.printf("%s is integer type%n", input);
            } else if (commandType.hasNextDouble()) {
                System.out.printf("%s is floating point type%n", input);
            } else if (commandType.hasNextBoolean()) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
