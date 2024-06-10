package MethodsMoreExercises;

import java.util.Scanner;

public class P05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        result(num1,num2,num3);
    }
    public static void result(int num1, int num2, int num3){
        if (isZero(num1, num2, num3)) {
            System.out.println("zero");
        } else if (isNegative(num1, num2, num3)) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
    public static boolean isNegative(int num1, int num2, int num3) {
        int negativeCount = 0;
        if (num1 < 0) negativeCount++;
        if (num2 < 0) negativeCount++;
        if (num3 < 0) negativeCount++;

        return negativeCount % 2 != 0;
    }
    public static boolean isZero(int num1, int num2, int num3){
        return num1 == 0 || num2 == 0 || num3 == 0;
    }
}
