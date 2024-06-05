package Methods;

import java.util.Scanner;

public class P01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNumber(number);
    }
    public static void printNumber(int number){
        if (number == 0){
            System.out.printf("The number %d is zero.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is positive.", number);
        }
    }
}
