package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String [] split = command.split(" ");
            if (split[0].equals("swap")){
                int firstNumber = Integer.parseInt(split[1]);
                int secondNumber = Integer.parseInt(split[2]);
                int swapNum1 = numbers[firstNumber];
                int swapNum2 = numbers[secondNumber];
                numbers[firstNumber] = swapNum2;
                numbers[secondNumber] = swapNum1;
            } else if (split[0].equals("multiply")) {
                int firstNumber = Integer.parseInt(split[1]);
                int secondNumber = Integer.parseInt(split[2]);
                int multiNum1 = numbers[firstNumber];
                int multiNum2 = numbers[secondNumber];
                numbers[firstNumber] = multiNum1 * multiNum2;
            } else if (split[0].equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
