package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String [] tokens = input.split(" ");
            if (tokens[0].equals("Delete")){
                int number = Integer.parseInt(tokens[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == number){
                        numbers.remove(Integer.valueOf(number));
                    }
                }
            } else if (tokens[0].equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                numbers.add(index,number);
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
