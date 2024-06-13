package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int wagonCapacity = Integer.parseInt(scanner.nextLine());
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String [] tokens = input.split(" ");
            if (tokens[0].equals("Add")){
                int passengersToAdd = Integer.parseInt(tokens[1]);
                wagons.add(passengersToAdd);
            } else {
                int passengers = Integer.parseInt(String.valueOf(Integer.valueOf(input)));
                for (int i = 0; i < wagons.size(); i++) {
                    if (passengers + wagons.get(i) <= wagonCapacity){
                        wagons.set(i,passengers+wagons.get(i));
                        break;
                    }
                }
            }
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
