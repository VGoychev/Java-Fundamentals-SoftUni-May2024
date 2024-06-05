package Methods;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        calculate(a,operator,b);
    }
    static void calculate(int a, String operator, int b){
        double result = 0.0;
        if (operator.equals("/")){
            result = (double) a / b;
        } else if (operator.equals("*")) {
            result = a * b;
        } else if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        }
        System.out.println(Math.round(result));
    }
}
