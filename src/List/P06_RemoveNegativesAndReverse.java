package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> onlyPositiveNumbersList = numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
        if (onlyPositiveNumbersList.isEmpty()){
            System.out.println("empty");
        } else {
            for (int i = onlyPositiveNumbersList.size() - 1; i >= 0; i--) {
                System.out.printf("%d ", onlyPositiveNumbersList.get(i));
            }
        }
    }
}
