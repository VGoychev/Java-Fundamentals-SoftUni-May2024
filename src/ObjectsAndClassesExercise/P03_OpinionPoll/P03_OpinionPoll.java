package ObjectsAndClassesExercise.P03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] people = scanner.nextLine().split(" ");
            String name = people[0];
            int age = Integer.parseInt(people[1]);

            Person currentPerson = new Person();
            currentPerson.setName(name);
            currentPerson.setAge(age);
            personList.add(currentPerson);
        }
        for (Person person : personList){
            if (person.getAge() > 30){
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }
    }
}
