package MidExamPreparation;

import java.util.Scanner;

public class P07_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeStudents = Integer.parseInt(scanner.nextLine());
        int secondEmployeStudents = Integer.parseInt(scanner.nextLine());
        int thirdEmployeStudents = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int studentsPerHour = firstEmployeeStudents + secondEmployeStudents + thirdEmployeStudents;
        int timeNeeded = 0;
        while (studentsCount > 0) {
           timeNeeded++;

            if (timeNeeded % 4 != 0) {
                studentsCount -= studentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", timeNeeded);
    }
}
