package TextProcessingExercise;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        for (String element : input){
            if (element.contains(".")){
                String[] directory = element.split("\\.");
                String name = directory[0];
                String extension = directory[1];
                System.out.println("File name: " + name);
                System.out.println("File extension: " + extension);
            }
        }
    }
}
