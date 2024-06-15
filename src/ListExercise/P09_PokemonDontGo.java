package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList());
        int sumRemoved = 0;
        while (!sequence.isEmpty()){
            int position = Integer.parseInt(scanner.nextLine());
            if (position > sequence.size() - 1){
                int removedElement = sequence.getLast();
                sumRemoved += removedElement;
                sequence.removeLast();
                int firstNumber = sequence.getFirst();
                sequence.add(firstNumber);
                modifyList(sequence,removedElement);
            } else if (position < 0){
                int removedElement = sequence.getFirst();
                sumRemoved += removedElement;
               sequence.removeFirst();
               int lastNumber = sequence.getLast();
               sequence.add(0,lastNumber);
               modifyList(sequence,removedElement);
            } else {
                int removedElement = sequence.get(position);
                sumRemoved += removedElement;
                sequence.remove(position);
                modifyList(sequence,removedElement);
            }

        }
        System.out.println(sumRemoved);
    }
    private static void modifyList(List<Integer> sequence, int removedElement){
        for (int position = 0; position <= sequence.size() - 1; position++) {
            int currentNumber = sequence.get(position);
            if(currentNumber <= removedElement){
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            sequence.set(position, currentNumber);
        }
    }
}
