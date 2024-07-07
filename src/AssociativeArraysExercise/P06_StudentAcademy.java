package AssociativeArraysExercise;

import java.util.*;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
                students.putIfAbsent(studentName,new ArrayList<>());
                students.get(studentName).add(grade);
        }
        Map<String, Double> averageGrades = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            if (averageGrade >= 4.50) {
                averageGrades.put(studentName, averageGrade);
            }
        }
        averageGrades.forEach((studentName, averageGrade) ->
                System.out.printf("%s -> %.2f%n", studentName, averageGrade)
        );
    }
}
