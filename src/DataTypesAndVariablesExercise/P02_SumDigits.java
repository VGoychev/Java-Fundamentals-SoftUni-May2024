package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
       while (n > 0){
           int currentSymbol = n % 10;
           sumOfDigits += currentSymbol;
           n = n / 10;
       }
        System.out.println(sumOfDigits);
    }
}
