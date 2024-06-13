package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            String [] tokens = input.split(" ");
            switch (tokens[0]){
                case "Add":
                    int number = Integer.parseInt(tokens[1]);
                    numbers.add(number);
                    break;
                case "Insert":
                    int num = Integer.parseInt(tokens[1]);
                    int ind = Integer.parseInt(tokens[2]);
                    if (ind >= numbers.size() || ind < 0){
                        System.out.println("Invalid index");
                        break;
                    } else {
                        numbers.add(ind, num);
                        break;
                    }
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= numbers.size() || index < 0){
                        System.out.println("Invalid index");
                        break;
                    } else {
                        numbers.remove(index);
                        break;
                    }
                case "Shift":
                    String command = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    count = count % numbers.size();
                    if (command.equals("left")){
                        for (int i = 0; i < count; i++) {
                            int first = numbers.remove(0);
                            numbers.add(first);
                        }
                        break;
                    } else if (command.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int last = numbers.remove(numbers.size()-1);
                            numbers.add(0,last);
                        }
                        break;
                    }

            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
