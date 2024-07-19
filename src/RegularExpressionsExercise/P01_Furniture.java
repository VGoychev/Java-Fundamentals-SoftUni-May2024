package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;
        System.out.println("Bought furniture:");
        while (true){
        String regex = ">>\\b(?<name>\\w.+)<<\\b(?<price>\\d+(\\.\\d+)?)!\\b(?<quantity>\\d+)";
        String input = scanner.nextLine();
        if (input.equals("Purchase")){
            break;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String furnitureName = matcher.group("name");
            double price = Double.parseDouble(matcher.group("price"));
            int quantity = Integer.parseInt(matcher.group("quantity"));

            totalMoney += price*quantity;
            System.out.println(furnitureName);
            }
        }
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
