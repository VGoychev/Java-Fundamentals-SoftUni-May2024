package DataTypesAndVariables;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNumber = false;
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int digits = i;
            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }
            isSpecialNumber = (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11);
            if (isSpecialNumber){
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
