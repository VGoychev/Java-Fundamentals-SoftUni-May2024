package ProgramingBasicsOverview;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; n > 0; i+=2) {
            System.out.println(i);
            sum += i;
            n--;
        }
        System.out.printf("Sum: %d",sum);
    }
}
