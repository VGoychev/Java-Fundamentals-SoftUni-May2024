package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Craft!")){
                break;
            }
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command){
                case "Collect":
                    if (!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (items.contains(item)){
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] check = tokens[1].split(":");
                    String oldItem = check[0];
                    String newItem = check[1];
                    if (items.contains(oldItem)){
                        items.add(items.indexOf(oldItem) + 1,newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)){
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }
        }
        System.out.println(items.toString().replace("[","").replace("]",""));
    }
}
