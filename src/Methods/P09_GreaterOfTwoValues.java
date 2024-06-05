package Methods;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result1;
        char result2;
        String result3;
        if (input.equals("int")) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            result1 = getMax(number1, number2);
            System.out.println(result1);
        } else if (input.equals("char")) {
            char char1 = scanner.nextLine().charAt(0);
            char char2 = scanner.nextLine().charAt(0);
            result2 = getMax(char1, char2);
            System.out.println(result2);
        } else if (input.equals("string")) {
            String text1 = scanner.nextLine();
            String text2 = scanner.nextLine();
            result3 = getMax(text1, text2);
            System.out.println(result3);
        }
    }
    static int getMax(int first, int second){
        if (first > second){
            return first;
        } else {
            return second;
        }
    }
    static char getMax(char first, char second){
        if (first > second){
            return first;
        } else {
            return second;
        }
    }
    static String getMax(String first, String second){
        if (first.compareTo(second) >= 0){
            return  first;
        } else {
            return second;
        }
    }
}
