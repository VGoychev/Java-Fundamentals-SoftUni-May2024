package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05_MultiplyBigNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BigInteger number1 = new BigInteger(scanner.nextLine());
            BigInteger number2 = new BigInteger(scanner.nextLine());
            BigInteger result = number1.multiply(number2);
            System.out.printf("%d", result);
        }
}
