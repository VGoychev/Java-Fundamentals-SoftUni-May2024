import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        System.out.println(name);
        System.out.print(age);
        System.out.printf("%f", grade);
    }
}
