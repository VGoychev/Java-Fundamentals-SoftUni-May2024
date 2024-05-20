package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int workersConsume = 26;
        int total = 0;
        int counter = 0;
        while (start >= 100){
            total += start - workersConsume;
            start -= 10;
            counter++;
            if (start < 100) {
                total -= 26;
            }
        }
        System.out.println(counter);
        System.out.println(total);
    }
}
