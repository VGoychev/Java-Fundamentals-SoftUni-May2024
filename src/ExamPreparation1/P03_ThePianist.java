package ExamPreparation1;

import java.util.*;

public class P03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> collection = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] currentInput = scanner.nextLine().split("\\|");

            String currentPiece = currentInput[0];
            String currentComposer = currentInput[1];
            String currentKey = currentInput[2];

            List<String> currentList = new ArrayList<>();
            currentList.add(currentComposer);
            currentList.add(currentKey);
            collection.put(currentPiece,currentList);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String currentCommand = input.split("\\|")[0];
            String currentPiece = input.split("\\|")[1];
            switch (currentCommand){
                case "Add":
                    if (!collection.containsKey(currentPiece)){
                        List<String> listToAdd = new ArrayList<>();
                        String currentComposerToAdd = input.split("\\|")[2];
                        String currentKeyToAdd = input.split("\\|")[3];
                        listToAdd.add(currentComposerToAdd);
                        listToAdd.add(currentKeyToAdd);
                        collection.put(currentPiece, listToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n", currentPiece, currentComposerToAdd, currentKeyToAdd);
                    } else {
                        System.out.println(currentPiece + " is already in the collection!");
                    }
                    break;
                case "Remove":
                    if (!collection.containsKey(currentPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    } else {
                        collection.remove(currentPiece);
                        System.out.printf("Successfully removed %s%n", currentPiece);
                    }
                    break;
                case "ChangeKey":
                    if (!collection.containsKey(currentPiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", currentPiece);
                    } else {
                        String newKey = input.split("\\|")[2];
                        collection.get(currentPiece).remove(1);
                        collection.get(currentPiece).add(newKey);

                        System.out.printf("Changed the key of %s to %s !%n", currentPiece, newKey);
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        collection.entrySet()
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
    }
}
