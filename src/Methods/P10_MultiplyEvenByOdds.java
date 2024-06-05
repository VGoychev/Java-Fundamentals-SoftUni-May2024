package Methods;

import java.util.Scanner;

public class P10_MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        getMultipleOfEvensAndOdds(n);
    }
    static void getMultipleOfEvensAndOdds(int number){
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        int sum = evenSum * oddSum;
        System.out.printf("%d", sum);
    }
    static int getEvenSum(int number){
        int evenSum = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number /= 10;
        }
        return  evenSum;
    }
    static int getOddSum(int number){
        int oddSum = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            number /= 10;
        }
        return oddSum;
    }
}
