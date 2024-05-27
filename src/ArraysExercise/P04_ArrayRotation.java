package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotation; i++) {
            int first = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j+1];
            }
            array[array.length - 1] = first;
        }
        for (int number : array){
            System.out.print(number + " ");
        }
    }
}
