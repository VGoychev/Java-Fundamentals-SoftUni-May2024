package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double biggestKegSize = 0.0;
        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * (radius * radius) * height;

            if (volume > biggestKegSize){
                biggestKegSize = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
