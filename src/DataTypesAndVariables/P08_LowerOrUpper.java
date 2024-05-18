package DataTypesAndVariables;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);
        if(symbol >= 'A' && symbol <= 'Z'){
            System.out.println("upper-case");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("lower-case");
        }
    }
}
