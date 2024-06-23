package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (true){
            String command = scanner.nextLine();
            if (command.equals("Finish")){
                break;
            }
            String[] commandElements = command.split(" ");
            String action = commandElements[0];
            switch (action){
                case "Add":
                    numbers.add(Integer.valueOf(commandElements[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(commandElements[1]));
                    break;
                case "Replace":
                    for (int position = 0; position <= numbers.size() - 1; position++) {
                        if (numbers.get(position).equals(Integer.valueOf(commandElements[1]))){
                            numbers.set(position,Integer.valueOf(commandElements[2]));
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int targetValue = Integer.valueOf(commandElements[1]);
                    numbers = numbers.stream()
                            .filter(n -> n >= targetValue)
                            .collect(Collectors.toList());
                    break;
            }
        }
        System.out.println(numbers.toString().replace("[", "").replace("]", "").replace(", ", " "));
    }
}
