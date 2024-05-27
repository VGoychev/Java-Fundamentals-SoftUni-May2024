package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 1; i <= n; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int first = numbers[0];
            int second = numbers[1];
            if (i % 2 == 0){
                firstArr[i - 1] = second;
                secondArr[i - 1] = first;
            } else {
                firstArr[i - 1] = first;
                secondArr[i - 1] = second;
            }
        }
        for (int number1 : firstArr) {
            System.out.print(number1 + " ");
        }
        System.out.println();
        for (int number2 : secondArr){
            System.out.print(number2 + " ");
        }
    }
}
