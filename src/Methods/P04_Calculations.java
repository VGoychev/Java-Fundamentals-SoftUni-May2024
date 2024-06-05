package Methods;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        switch (command){
            case "add":
                add(first,second);
                break;
            case "subtract":
                subtract(first,second);
                break;
            case "multiply":
                multiply(first,second);
                break;
            case "divide":
                divide(first,second);
                break;
        }
    }
    public static void add(int number1, int number2){
        System.out.println(number1 + number2);
    }
    public static void subtract(int number1, int number2){
        System.out.println(number1 - number2);
    }
    public static void multiply(int number1, int number2){
        System.out.println(number1 * number2);
    }
    public static void divide(int number1, int number2){
        System.out.println(number1 / number2);
    }
}
