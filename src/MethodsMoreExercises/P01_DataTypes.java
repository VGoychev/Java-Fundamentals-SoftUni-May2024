package MethodsMoreExercises;

import java.util.Scanner;

public class P01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        readInput(input, input2);
    }

    static void readInput(String a, String b){
        if (a.equals("int")){
            int result = Integer.parseInt(b) * 2;
            System.out.println(result);
        } else if (a.equals("real")) {
            double result = Double.parseDouble(b) * 1.5;
            System.out.printf("%.2f", result);
        } else if (a.equals("string")) {
            System.out.printf("$%s$", b);
        }
    }
}
