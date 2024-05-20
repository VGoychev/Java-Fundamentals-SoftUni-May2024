package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int tank = 255;
        int capacity = 0;
        for (int i = 1; i <= n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            capacity += quantity;
            if(capacity > tank){
                System.out.println("Insufficient capacity!");
                capacity -= quantity;
            }
        }
        System.out.println(capacity);
    }
}
