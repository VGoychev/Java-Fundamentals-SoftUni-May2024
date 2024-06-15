package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstDeck = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());
        List<Integer> secondDeck = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());
        int sum = 0;
        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()){
            int firstCard = firstDeck.remove(0);
            int secondCard = secondDeck.remove(0);
            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(secondCard);
                secondDeck.add(firstCard);
            }
        }
        if (firstDeck.isEmpty()){
            for (int number : secondDeck) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        } else {
            for (int number : firstDeck) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
    }
}
