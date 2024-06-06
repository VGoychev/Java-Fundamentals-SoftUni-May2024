package MethodsExercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        divideFactorial(first, second);

    }
    static void divideFactorial(int a, int b){
        double result = getFirstFactorial(a) / getSecondFactorial(b);
        System.out.printf("%.2f", result);

    }
    static double getFirstFactorial(int a){
        double result = 1;
        for (int i = a; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
    static double getSecondFactorial(int a){
        double result = 1;
        for (int i = a; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}
