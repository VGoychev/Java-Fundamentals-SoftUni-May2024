package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());

        BigInteger number = number1.add(number2);
        System.out.println(number);
    }
}
