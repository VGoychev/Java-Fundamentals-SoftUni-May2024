package MidExam;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());
        double apronsNeeded = Math.ceil(studentsCount * 1.2);
        int freePackages = studentsCount / 5;
        double totalNeeded = apronPrice * apronsNeeded + eggPrice * 10 * studentsCount + flourPrice * (studentsCount - freePackages);
        if (totalNeeded <= budget) {
            System.out.printf("Items purchased for %.2f$.", totalNeeded);
        } else {
            double moneyNeeded = totalNeeded - budget;
            System.out.printf("%.2f$ more needed.",moneyNeeded);
        }
    }
}
