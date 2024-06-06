package MethodsExercise;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int sum = getSumOfFirst(first,second);
        int result = getSubtractInt(sum,third);
        System.out.println(result);
    }
    static int getSumOfFirst(int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
    static int getSubtractInt(int a, int b){
        int sum = 0;
        sum = a - b;
        return sum;
    }
}
