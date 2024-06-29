package ObjectsAndClassesExercise.P04_Students;

import java.util.*;

public class P04_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student currentStudent = new Student();
            currentStudent.setFirstName(firstName);
            currentStudent.setLastName(lastName);
            currentStudent.setGrade(grade);

            students.add(currentStudent);
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : students){
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
