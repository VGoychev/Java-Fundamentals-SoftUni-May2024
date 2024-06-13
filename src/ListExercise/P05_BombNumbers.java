package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> specialNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber = specialNumbers.get(0);
        int bombPower = specialNumbers.get(1);
        while (numbers.contains(bombNumber)){
            int index = numbers.indexOf(bombNumber);
            int start = Math.max(0,index - bombPower);
            int end = Math.min(numbers.size() - 1, index + bombPower);
            for (int i = end; i >= start; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }
}
