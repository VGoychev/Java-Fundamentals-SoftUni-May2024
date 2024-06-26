package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumEven = 0;
        int sumOdd = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                sumEven+= numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }
        sum = sumEven - sumOdd;
        System.out.println(sum);
    }
}
