package ProgramingBasicsOverviewExercise;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int leftNumber = num;
        int counter = 0;
        while (leftNumber > 0){
            int lastNumber = leftNumber % 10;
            int fact = 1;
            for (int i = 1; i <= lastNumber ; i++) {
                fact = fact * i;
            }
            counter += fact;
            fact = 1;
            leftNumber = leftNumber / 10;
        }
        if (counter == num){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
