package ProgramingBasicsOverviewMoreExercises;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double spent = 0;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")){
            double price = 0;
            if (input.equals("OutFall 4")){
                price = 39.99;
                if(balance >= price){
                    System.out.println("Bought OutFall 4");
                    balance -= price;
                    spent += price;
                    if(balance == 0){
                        System.out.println("Out of money!");
                        return;
                    }
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("CS: OG")) {
                price = 15.99;
                if(balance >= price){
                    System.out.println("Bought CS: OG");
                    balance -= price;
                    spent += price;
                    if(balance == 0){
                        System.out.println("Out of money!");
                        return;
                    }
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                if(balance >= price){
                    System.out.println("Bought Zplinter Zell");
                    balance -= price;
                    spent += price;
                    if(balance == 0){
                        System.out.println("Out of money!");
                        return;
                    }
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("Honored 2")) {
                price = 59.99;
                if(balance >= price){
                    System.out.println("Bought Honored 2");
                    balance -= price;
                    spent += price;
                    if(balance == 0){
                        System.out.println("Out of money!");
                        return;
                    }
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                if(balance >= price){
                    System.out.println("Bought RoverWatch");
                    balance -= price;
                    spent += price;
                    if(balance == 0){
                        System.out.println("Out of money!");
                        return;
                    }
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if(balance >= price){
                    System.out.println("Bought RoverWatch Origins Edition");
                    balance -= price;
                    spent += price;
                    if(balance == 0){
                        System.out.println("Out of money!");
                        return;
                    }
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
    }
}
