package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        while (true){
            String resource = scanner.nextLine();
            if (resource.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resources.containsKey(resource)){
                resources.put(resource,quantity);
            } else {
                int currentQuantity = resources.get(resource);
                resources.put(resource,quantity + currentQuantity);
            }

        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }
    }
}
