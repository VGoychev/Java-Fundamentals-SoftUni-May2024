package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) persons /capacity);
        System.out.printf("%d",courses);
    }
}
