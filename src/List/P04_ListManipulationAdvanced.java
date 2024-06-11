package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String [] tokens = line.split(" ");
            switch (tokens[0]){
                case "Contains":
                    int num = Integer.parseInt(tokens[1]);
                    if (numbers.contains(num)) {
                    System.out.println("Yes");
                    }  else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")){
                        List<Integer> evenNums = numbers.stream().filter(number -> number % 2 == 0)
                                .collect(Collectors.toList());
                        System.out.println(evenNums.toString().replaceAll("[\\[\\],]", ""));
                } else if (tokens[1].equals("odd")) {
                        List<Integer> oddNums = numbers.stream().filter(number -> number % 2 == 1)
                                .collect(Collectors.toList());
                        System.out.println(oddNums.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    int sumNums = numbers.stream().mapToInt(Integer::intValue).sum();
                    System.out.println(sumNums);
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int number = Integer.parseInt(tokens[2]);
                    if (condition.equals("<")){
                        List<Integer> lessNumbers = numbers.stream().filter(n -> n < number )
                                .collect(Collectors.toList());
                        System.out.println(lessNumbers.toString().replaceAll("[\\[\\],]", ""));
                    } else if (condition.equals(">")) {
                        List<Integer> biggerNumbers = numbers.stream().filter(n -> n > number )
                                .collect(Collectors.toList());
                        System.out.println(biggerNumbers.toString().replaceAll("[\\[\\],]", ""));
                    } else if (condition.equals(">=")) {
                        List<Integer> biggerOrEqualNumbers = numbers.stream().filter(n -> n >= number )
                                .collect(Collectors.toList());
                        System.out.println(biggerOrEqualNumbers.toString().replaceAll("[\\[\\],]", ""));
                    } else if (condition.equals("<=")) {
                        List<Integer> lessOrEqualNumbers = numbers.stream().filter(n -> n <= number )
                                .collect(Collectors.toList());
                        System.out.println(lessOrEqualNumbers.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
            }
        }
    }
}
