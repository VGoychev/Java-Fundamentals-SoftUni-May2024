package AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            if (tokens[0].equals("register")){
                String username = tokens[1];
                String licensePlateNumber = tokens[2];
                if (!parking.containsKey(username)){
                    parking.put(username,licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                }
            } else if (tokens[0].equals("unregister")) {
                String username = tokens[1];
                if (!parking.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parking.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        for (Map.Entry<String, String> entry : parking.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(),entry.getValue());
        }
    }
}
