package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 0; i < commands; i++) {
            String input = scanner.nextLine();
            String [] tokens = input.split(" ");
            if (tokens[2].equals("going!")){
                if (names.contains(tokens[0])){
                    System.out.printf("%s is already in the list!%n", tokens[0]);
                } else{
                names.add(tokens[0]);
                }
            }
            if (tokens[2].equals("not")){
                if (!names.contains(tokens[0])){
                    System.out.printf("%s is not in the list!%n", tokens[0]);
                } else {
                    names.remove(tokens[0]);
                }
            }
        }
        for (String name: names){
            System.out.println(name);
        }
    }
}
