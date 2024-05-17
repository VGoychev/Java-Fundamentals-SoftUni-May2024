package ProgramingBasicsOverviewExercise;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        int counter = 0;
        for (int position = username.length() - 1; position >= 0; position--) {
            char symbol = username.charAt(position);
            password += symbol;
        }
        String attempt = scanner.nextLine();
        while (!attempt.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            attempt = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
