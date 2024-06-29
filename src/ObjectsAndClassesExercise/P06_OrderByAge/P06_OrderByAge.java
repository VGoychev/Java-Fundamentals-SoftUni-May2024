package ObjectsAndClassesExercise.P06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P06_OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        while (true){
            String command = scanner.nextLine();
            if (command.equals("End")){
                break;
            }
            String[] input = command.split(" ");
            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);

            Person currentPerson = new Person();

            currentPerson.setName(name);
            currentPerson.setId(id);
            currentPerson.setAge(age);

            personList.add(currentPerson);

        }
        personList.sort(Comparator.comparingInt(Person::getAge));

        for (Person person : personList){
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}
