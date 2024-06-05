package Methods;

import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = mathPower(number,power);
        System.out.printf("%.0f", result);
    }
    public static double mathPower(double num, int power){
        double result = Math.pow(num,power);
        return result;
    }
}
