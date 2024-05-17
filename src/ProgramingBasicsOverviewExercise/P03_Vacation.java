package ProgramingBasicsOverviewExercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double sum = 0;
        double price = 0;
        switch (typeOfGroup){
            case "Students":
                if(dayOfTheWeek.equals("Friday")){
                    price = 8.45;
                    if (group >= 30){
                        price = price * 0.85;
                    }
                    sum = price * group;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    price = 9.80;
                    if (group >= 30){
                        price = price * 0.85;
                    }
                    sum = price * group;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    price = 10.46;
                    if (group >= 30){
                        price = price * 0.85;
                    }
                    sum = price * group;
                }
                break;
            case "Business":
                if(dayOfTheWeek.equals("Friday")){
                    price = 10.90;
                    if (group >= 100){
                        sum = price * (group - 10);
                    } else {
                        sum = price * group;
                    }
                } else if (dayOfTheWeek.equals("Saturday")) {
                    price = 15.60;
                    if (group >= 100){
                        sum = price * (group - 10);
                    } else {
                        sum = price * group;
                    }
                } else if (dayOfTheWeek.equals("Sunday")) {
                    price = 16;
                    if (group >= 100){
                        sum = price * (group - 10);
                    } else {
                        sum = price * group;
                    }
                }
                break;
            case "Regular":
                if(dayOfTheWeek.equals("Friday")){
                    price = 15;
                    if (group >= 10 && group <= 20){
                        price = price * 0.95;
                    }
                    sum = price * group;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    price = 20;
                    if (group >= 10 && group <= 20){
                        price = price * 0.95;
                    }
                    sum = price * group;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    price = 22.50;
                    if (group >= 10 && group <= 20){
                        price = price * 0.95;
                    }
                    sum = price * group;
                }
                break;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
