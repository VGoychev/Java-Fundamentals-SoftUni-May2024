package DataTypesAndVariables;

import java.util.Scanner;

public class P07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);
        result += symbol3 + " ";
        result += symbol2 + " ";
        result += symbol1 + " ";
        System.out.println(result);
    }
}
