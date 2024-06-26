package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        BigInteger num = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= number; i++) {
            num = num.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(num);
    }
}
