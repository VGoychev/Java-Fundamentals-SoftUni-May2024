package ObjectsAndClasses.P05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while (true){
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }
            String[] tokens = command.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String homeTown = tokens[3];

            Student currentStudent = new Student();

            currentStudent.setFirstName(firstName);
            currentStudent.setLastName(lastName);
            currentStudent.setAge(age);
            currentStudent.setHomeTown(homeTown);
            if (IsStudentExisting(students,firstName,lastName)){
                Student student = getStudent(students,firstName,lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            } else {
                students.add(currentStudent);
            }
        }
        String town = scanner.nextLine();
        for (Student student : students){
            if (student.getHomeTown().equals(town)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static boolean IsStudentExisting(List<Student> students, String firstName, String lastName){
        for (Student student : students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
    private static Student getStudent(List<Student> students, String firstName, String lastName){
        Student existingStudent = null;

        for (Student student : students){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}
