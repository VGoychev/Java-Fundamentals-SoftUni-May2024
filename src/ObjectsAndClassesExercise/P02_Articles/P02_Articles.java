package ObjectsAndClassesExercise.P02_Articles;

import java.util.Scanner;

public class P02_Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(", ");
        String title = tokens[0];
        String content = tokens[1];
        String author = tokens[2];

        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setAuthor(author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commandTokens = command.split(": ");
            switch (commandTokens[0]){
                case "Edit":
                    article.setContent(commandTokens[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commandTokens[1]);
                    break;
                case "Rename":
                    article.setTitle(commandTokens[1]);
                    break;
            }
        }
        String msg = article.message();
        System.out.println(msg);
    }
}
