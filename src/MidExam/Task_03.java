package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chat = new ArrayList<>();
        while (true){
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }
            String[]commandElements = command.split(" ");
            String action = commandElements[0];
            switch (action){
                case "Chat":
                    chat.add(commandElements[1]);
                    break;
                case "Delete":
                    if (chat.contains(commandElements[1])){
                        chat.remove(commandElements[1]);
                    }
                    break;
                case "Edit":
                    if (chat.contains(commandElements[1])){
                        chat.set(chat.indexOf(commandElements[1]),commandElements[2]);
                    }
                    break;
                case "Pin":
                    String givenMessage = commandElements[1];
                    if (chat.contains(givenMessage)){
                        chat.remove(givenMessage);
                        chat.add(givenMessage);
                    }
                    break;
                case "Spam":
                    for (int position = 1; position <= commandElements.length - 1; position++) {
                        chat.add(commandElements[position]);
                    }
                    break;
            }
        }
        for (String message : chat){
            System.out.println(message);
        }
    }
}
