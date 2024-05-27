package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];
            if (numbers1[i] != numbers2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                return;
            }
        }
            System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
