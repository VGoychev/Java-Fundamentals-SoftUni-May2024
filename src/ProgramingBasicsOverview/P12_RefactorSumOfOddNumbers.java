package ProgramingBasicsOverview;

import java.util.Scanner;

public class P12_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; n > 0; i+=2) {
            System.out.println(i);
            sum += i;
            n--;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
