package MidExamPreparation;

import java.util.Scanner;

public class P02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        String[] rooms = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            String[] currentRoom = rooms[i].split(" ");
            int number = Integer.parseInt(currentRoom[1]);
            if (currentRoom[0].equals("potion")){
                    if (number + health > 100){
                        number = 100 - health;
                    }
                    health+= number;
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
            } else if (currentRoom[0].equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health -= number;
                if (health > 0){
                    System.out.printf("You slayed %s.%n", currentRoom[0]);
                } else {
                    System.out.printf("You died! Killed by %s.%n", currentRoom[0]);
                    System.out.printf("Best room: %d", i+1);
                    return;
                }
            }
        }
        if (health > 0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }

    }
}
