package DataTypesAndVariables;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        char symbol1 = scanner.nextLine().charAt(0);
        result += symbol1;
        char symbol2 = scanner.nextLine().charAt(0);
        result += symbol2;
        char symbol3 = scanner.nextLine().charAt(0);
        result += symbol3;
        System.out.println(result);
    }
}
