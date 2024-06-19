package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingItems = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
    while (true){
            String command = scanner.nextLine();
            if (command.equals("Go Shopping!")){
                break;
            }
            String[] tokens = command.split(" ");
            String action = tokens[0];
            String item = tokens[1];
            switch (action){
                case "Urgent":
                    if (!shoppingItems.contains(item)){
                        shoppingItems.add(0, tokens[1]);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingItems.contains(item)){
                        shoppingItems.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    if (shoppingItems.contains(item)){
                        shoppingItems.set(shoppingItems.indexOf(item),newItem);
                    }
                    break;
                case "Rearrange":
                    if(shoppingItems.contains(item)){
                        shoppingItems.remove(item);
                        shoppingItems.add(item);
                    }
                    break;
            }
        }
        System.out.println(shoppingItems.toString().replace("[", "").replace("]", "")
                .replace("!",","));
    }
}
