package ExamPreparation2;

import java.util.Scanner;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder activationKey = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] token = input.split(">>>");
            String command = token[0];

            switch (command) {
                case "Contains":
                    String word = token[1];
                    if (activationKey.toString().contains(word)) {
                        System.out.printf("%s contains %s%n", activationKey, word);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String move = token[1];
                    int start = Integer.parseInt(token[2]);
                    int end = Integer.parseInt(token[3]);
                    String substring = activationKey.substring(start, end);
                    String transformedSubstring = "";

                    if (move.equals("Upper")) {
                        transformedSubstring = substring.toUpperCase();
                    } else if (move.equals("Lower")) {
                        transformedSubstring = substring.toLowerCase();
                    }

                    activationKey.replace(start, end, transformedSubstring);
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    int startIndex = Integer.parseInt(token[1]);
                    int endIndex = Integer.parseInt(token[2]);

                    if (startIndex >= 0 && endIndex <= activationKey.length()) {
                        activationKey.delete(startIndex, endIndex);
                    }

                    System.out.println(activationKey);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);
    }
}
