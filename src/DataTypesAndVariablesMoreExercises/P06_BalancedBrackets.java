package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class P06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int openingSymbol = 0;
        int closingSymbol = 0;
        int openDuplication = 0;
        int closeDuplication = 0;
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openingSymbol++;
                openDuplication++;
                closeDuplication = 0;
            } else if (input.equals(")")){
                closingSymbol++;
                openDuplication = 0;
                closeDuplication++;
            }
            if (openDuplication > 1 || closeDuplication > 1) {
                break;
            }
        }
        if (openingSymbol == closingSymbol) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
