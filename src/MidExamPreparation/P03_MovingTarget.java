package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("End")){

            String currentCommand = command.get(0);

            int index = Integer.parseInt(command.get(1));

            switch (currentCommand){

                case "Shoot" ->{

                    if(index < targets.size() && index >=0){
                        int power = Integer.parseInt(command.get(2));
                        int currentTargetValue = targets.get(index);
                        int newValue = currentTargetValue - power;
                        targets.set(index, newValue);

                        if(newValue <= 0){
                            targets.remove(index);
                        }
                    }
                }

                case "Add" -> {

                    if(index < targets.size() && index >=0){
                        int value = Integer.parseInt(command.get(2));
                        targets.add(index, value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                }

                case "Strike" -> {
                    int radius = Integer.parseInt(command.get(2));

                    if(index - radius >= 0 && index + radius < targets.size()){

                        targets.subList(index - radius, index + radius + 1).clear();

                    }else {
                        System.out.println("Strike missed!");
                    }

                }
            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }


        System.out.println(targets.toString().replace("[", "").replace("]", "").replaceAll(", ", "|"));




    }
}
