package DataTypesAndVariables;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meter = Integer.parseInt(scanner.nextLine());
        double kilometer = meter / 1000.0;
        System.out.printf("%.2f", kilometer);
    }
}
