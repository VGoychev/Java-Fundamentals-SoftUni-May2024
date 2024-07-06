package AssociativeArrays;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();

            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());



            words.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()){
            String currentWord = entry.getKey();
            List<String> synonymsForCurrentWord = entry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }
    }
}
