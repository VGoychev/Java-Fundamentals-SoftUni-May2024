package ExamPreparation1;

import java.util.Scanner;

public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder worldTour = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Travel")){
            String[] command = input.split(":");
            switch (command[0]){
                case "Add Stop":
                    int index = Integer.parseInt(command[1]);
                    String destinationToAdd = command[2];
                    if (index >= 0 && index < worldTour.toString().length()){
                        worldTour.insert(index, destinationToAdd);
                    }
                    System.out.println(worldTour);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]) + 1;
                    if (startIndex >= 0 && endIndex <= worldTour.toString().length()){
                        worldTour.replace(startIndex,endIndex,"");
                    }
                    System.out.println(worldTour);
                    break;
                case "Switch":
                    String oldDestination = command[1];
                    String newDestination = command[2];
                    //Hawai::Rome-Greece
                    int firstIndex = worldTour.indexOf(oldDestination);// index 0
                    int secondIndex = firstIndex + oldDestination.length(); // index 5
                    if (worldTour.toString().contains(oldDestination)){
                        worldTour.replace(firstIndex,secondIndex,newDestination);
                    }
                    System.out.println(worldTour);
                    break;
            }



            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", worldTour);
    }
}
