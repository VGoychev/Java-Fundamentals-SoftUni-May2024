package TextProcessing;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] keys = input.split(", ");
        String text = scanner.nextLine();
        for (String banWord : keys){
            if (text.contains(banWord)){
                String replacement = repeatStr("*", banWord.length());
                text = text.replace(banWord, replacement);
            }
        }
        System.out.println(text);
    }
    private static String repeatStr(String str , int length){
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += str;
        }
        return replacement;
    }
}
