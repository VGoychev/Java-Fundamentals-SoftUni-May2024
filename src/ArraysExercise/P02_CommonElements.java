package ArraysExercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String[] arr1 = first.split(" ");
        String[] arr2 = second.split(" ");
        for (String element2 : arr2) {
            for (String element1 : arr1){
                if (element2.equals(element1)){
                    System.out.print(element2 + " ");
                }
            }
        }
    }
}
