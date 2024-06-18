package MidExamPreparation;

import java.util.Scanner;

public class P01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double total = 0.0;
        double taxes = 0.0;
        double totalWithTaxes = 0.0;
        while (true){
            if (input.equals("special")){
                break;
            } else if (input.equals("regular")){
                break;
            } else {
                double number = Double.parseDouble(input);
                if (number < 0 ){
                    System.out.println("Invalid price!");
                } else {
                    total += number;
                }
            }
            input = scanner.nextLine();
        }
        taxes = total * 20 / 100;
        totalWithTaxes = total + taxes;

        if (input.equals("regular")){
            if (total == 0){
                System.out.println("Invalid order!");
            } else {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", total);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", totalWithTaxes);
            }
        } else if (input.equals("special")) {
            if (total == 0){
                System.out.println("Invalid order!");
            } else {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", total);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", totalWithTaxes - totalWithTaxes * 10 / 100);
            }
        }
    }
}
