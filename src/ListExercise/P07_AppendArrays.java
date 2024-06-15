package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> texts = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(texts);
        System.out.println(texts.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "") // заменя символа "," с нищо ""
                .replaceAll("\\s+", " ") // заменя, ако има повече от 1 празно място
                                                        // едно до друго с едно празно място
                .trim()); // Маха празните места в началото и края, ако има такива
    }
}
