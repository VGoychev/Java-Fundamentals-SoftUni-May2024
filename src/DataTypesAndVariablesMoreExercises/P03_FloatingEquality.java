package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class P03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double diff = 0.000001;
        if (Math.abs(n1 - n2) < diff) {
            System.out.printf("True%n");
        } else {
            System.out.printf("False%n");
        }
    }
}
