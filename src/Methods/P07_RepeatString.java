package Methods;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeater = Integer.parseInt(scanner.nextLine());
        String result = getString(input, repeater);
        System.out.println(result);
    }
    public static String getString(String input, int repeater){
        String result = "";
        for (int i = 1; i <= repeater; i++) {
            result += input;
        }
        return result;
    }
}
