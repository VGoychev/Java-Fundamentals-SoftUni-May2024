package ProgramingBasicsOverview;

import java.util.Scanner;

public class P07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        if (age < 0 || age > 122){
            System.out.println("Error!");
        }
        if( typeOfDay.equals("Weekday")){
            if(0 <= age && age <= 18){
                price = 12;
            } else if (18 < age && age <= 64){
                price = 18;
            } else if (64 < age && age <= 122) {
                price = 12;
            }
            if(price > 0){
                System.out.printf("%d$", price);
            }
        } else if (typeOfDay.equals("Weekend")) {
            if(0 <= age && age <= 18){
                price = 15;
            } else if (18 < age && age <= 64){
                price = 20;
            } else if (64 < age && age <= 122) {
                price = 15;
            }
            if(price > 0){
                System.out.printf("%d$", price);
            }

        } else if (typeOfDay.equals("Holiday")) {
            if(0 <= age && age <= 18){
                price = 5;
            } else if (18 < age && age <= 64){
                price = 12;
            } else if (64 < age && age <= 122) {
                price = 10;
            }
            if(price > 0){
                System.out.printf("%d$", price);
            }
        }

    }
}
