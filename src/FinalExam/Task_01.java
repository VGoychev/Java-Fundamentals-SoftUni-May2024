package FinalExam;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Finalize")){
            String[] command = input.split(" ");
            String action = command[0];
            switch (action){
                case "Encrypt":
                    message.reverse();
                    System.out.println(message);
                    break;
                case "Decrypt":
                    for (int i = 0; i < message.length(); i++) {
                        char c = message.charAt(i);

                        if(Character.isUpperCase(c)){
                            message.setCharAt(i,Character.toLowerCase(c));
                        } else if (Character.isLowerCase(c)){
                            message.setCharAt(i,Character.toUpperCase(c));
                        }
                    }
                    System.out.println(message);
                    break;
                case "Substitute":
                    boolean isFound = false;
                    char oldChar = command[1].charAt(0);
                    char newChar = command[2].charAt(0);
                    for (int i = 0; i < message.length(); i++) {
                        if (message.charAt(i) == oldChar) {
                            message.setCharAt(i, newChar);
                            isFound = true;
                        }
                    }

                    if (isFound) {
                        System.out.println(message);
                    } else {
                        System.out.println("Character not found.");
                    }
                    break;
                case "Scramble":
                    int index = Integer.parseInt(command[1]);
                    char symbol = command[2].charAt(0);
                    if (index >= 0 && index < message.length()) {
                        message.setCharAt(index, symbol);
                        System.out.println(message);
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case "Remove":
                    int start = 0;
                    String word = command[1];
                    while ((start = message.indexOf(word)) != -1) {
                        message.delete(start, start + word.length());
                    }
                    System.out.println(message);
                    break;
                default:
                    System.out.println("Invalid command detected!");
            }

            input = scanner.nextLine();
        }
    }
}
