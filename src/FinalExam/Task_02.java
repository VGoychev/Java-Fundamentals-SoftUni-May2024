package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<text>[A-Za-z]{8,})]";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (!matcher.find()){
                System.out.println("The message is invalid");
            } else {
                String command = matcher.group("command");
                String text = matcher.group("text");
                StringBuilder asciiValues = new StringBuilder();
                for (char c : text.toCharArray()) {
                    asciiValues.append((int) c).append(" ");
                }
                String result = String.format("%s: %s", command, asciiValues.toString().trim());
                System.out.println(result);
            }
        }
    }
}
