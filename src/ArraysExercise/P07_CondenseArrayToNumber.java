package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] temporary = new int[numbers.length]; // взема дължината на numbers
        for (int i = 0; i < numbers.length; i++) {
            temporary[i] = numbers[i]; // взема стойностите на numbers
        }
        for (int i = 0; i < numbers.length - 1; i++) { // цикъл преминаващ през всеки елемент на numbers
            int[] current = new int[temporary.length - 1]; // след преминаване на следващ елемент от numbers, дължината на current се намалява с 1;
            for (int j = 0; j < current.length; j++) { // преминаване през дължината на current, която е с 1 по-малка от тази на temp
                current[j] = temporary[j] + temporary[j+1]; // за всеки елемент от позиция на current се събира елемент от позиция j + последващият негов на temp
            }
            temporary = current; // temp взима стойностите на current (дължина и елементи)
        }
        System.out.println(temporary[0]);
    }
}
