package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class P08_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String[] command = input.split(" ");
            int firstIndex = 0;
            int secondIndex = 0;
            switch (command[0]){
                case "swap":
                    firstIndex = Integer.parseInt(command[1]);
                    secondIndex = Integer.parseInt(command[2]);
                    int temp = numbers[firstIndex];
                    numbers[firstIndex] = numbers[secondIndex];
                    numbers[secondIndex] = temp;
                    break;
                case "multiply":
                    firstIndex = Integer.parseInt(command[1]);
                    secondIndex = Integer.parseInt(command[2]);
                    numbers[firstIndex] = numbers[firstIndex] * numbers[secondIndex];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i]--;
                    }
                    break;
            }
        }
        System.out.println(Arrays.toString(numbers).replace("[","").replace("]",""));
    }
}
