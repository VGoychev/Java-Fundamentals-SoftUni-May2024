package ExamPreparation2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        List<String> productGroup = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (!matcher.find()){
                System.out.println("Invalid barcode");
            } else {
                String current = "";
                for (int index = 0 ; index <= input.length() - 1; index++) {
                    char symbol = input.charAt(index);
                    if (Character.isDigit(symbol)){
                        current += symbol;
                    }
                }
                if (current.isEmpty()){
                    System.out.println("Product group: 00");
                    String emptyGroup = "00";
                    productGroup.add(emptyGroup);
                } else {
                    System.out.println("Product group: " + current);
                    productGroup.add(current);
                }
            }

        }
    }
}
