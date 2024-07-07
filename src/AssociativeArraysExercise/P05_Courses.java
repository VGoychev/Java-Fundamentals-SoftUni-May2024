package AssociativeArraysExercise;

import java.util.*;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            if (!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            } else {
                courses.get(courseName).add(studentName);
            }
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()){
            System.out.printf("%s: %d%n", entry.getKey(),entry.getValue().size());
            for (String name : entry.getValue()) {
                System.out.printf("-- %s%n", name);
            }
        }
    }
}
