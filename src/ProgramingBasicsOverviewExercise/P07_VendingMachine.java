package ProgramingBasicsOverviewExercise;

import java.util.Scanner;
public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalMoney = 0.0;
        while (!command.equals("Start")){
            double money = Double.parseDouble(command);
            if (money == 0.10) {
                totalMoney += 0.10;
            } else if (money == 0.20) {
                totalMoney += 0.20;
            } else if (money == 0.50) {
                totalMoney += 0.50;
            } else if (money == 1) {
                totalMoney += 1;
            } else if (money == 2) {
                totalMoney += 2;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            if (product.equals("Nuts")) {
                if (totalMoney >= 2.0) {
                    System.out.println("Purchased Nuts");
                    totalMoney -= 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                if (totalMoney >= 0.70) {
                    System.out.println("Purchased Water");
                    totalMoney -= 0.70;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }  else if (product.equals("Crisps")) {
                if (totalMoney >= 1.50) {
                    System.out.println("Purchased Crisps");
                    totalMoney -= 1.50;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }  else if (product.equals("Soda")) {
                if (totalMoney >= 0.80) {
                    System.out.println("Purchased Soda");
                    totalMoney -= 0.80;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }   else if (product.equals("Coke")) {
                if (totalMoney >= 1.00) {
                    System.out.println("Purchased Coke");
                    totalMoney -= 1.00;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
