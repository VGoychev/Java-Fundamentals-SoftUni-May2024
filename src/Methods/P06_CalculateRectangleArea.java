package Methods;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Integer.parseInt(scanner.nextLine());
        double height = Integer.parseInt(scanner.nextLine());
        double area = getRectangleArea(width, height);
        System.out.printf("%.0f", area);
    }
    public static double getRectangleArea(double width, double height){
        return width * height;
    }
}
