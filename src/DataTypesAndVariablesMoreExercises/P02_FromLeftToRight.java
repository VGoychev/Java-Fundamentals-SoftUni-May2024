package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class P02_FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            long leftNumber = Long.parseLong(numbers[0]);
            long rightNumber = Long.parseLong(numbers[1]);
            int sumOfNumbers = 0;
            long pickedNumber = 0;
            if (leftNumber > rightNumber){
                pickedNumber = leftNumber;
            } else if (leftNumber <= rightNumber){
                pickedNumber = rightNumber;
            }
            while (pickedNumber != 0){
                long lastDigit = pickedNumber % 10;
                sumOfNumbers += lastDigit;
                pickedNumber /= 10;
            }
            System.out.printf("%d%n", Math.abs(sumOfNumbers));
        }
    }
}
