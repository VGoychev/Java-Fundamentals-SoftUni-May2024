package MethodsMoreExercises;

import java.util.Scanner;

public class P03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstX1 = Integer.parseInt(scanner.nextLine());
        int firstY1 = Integer.parseInt(scanner.nextLine());
        int firstX2 = Integer.parseInt(scanner.nextLine());
        int firstY2 = Integer.parseInt(scanner.nextLine());
        int secondX1 = Integer.parseInt(scanner.nextLine());
        int secondY1 = Integer.parseInt(scanner.nextLine());
        int secondX2 = Integer.parseInt(scanner.nextLine());
        int secondY2 = Integer.parseInt(scanner.nextLine());
        double firstPairPointLength = getDistanceBetween2Points(firstX1, firstY1, firstX2, firstY2);
        double secondPairPointLength = getDistanceBetween2Points(secondX1, secondY1, secondX2, secondY2);
        double howCloseIsFirstPoint = getDistanceBetween2Points(firstX1, firstY1, 0, 0);
        double howCloseIsSecondPoint = getDistanceBetween2Points(firstX2, firstY2, 0, 0);
        double howCloseIsThirdPoint = getDistanceBetween2Points(secondX1, secondY1, 0, 0);
        double howCloseIsForthPoint = getDistanceBetween2Points(secondX2, secondY2, 0, 0);
        printLongOne(firstPairPointLength,secondPairPointLength,howCloseIsFirstPoint,howCloseIsSecondPoint,
                howCloseIsThirdPoint,howCloseIsForthPoint,firstX1,firstY1,firstX2,firstY2,
                secondX1,secondY1,secondX2,secondY2);
    }
    private static double getDistanceBetween2Points(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
    private static void printLongOne(double firstPairPointLength, double secondPairPointLength, double howCloseIsFirstPoint, double howCloseIsSecondPoint, double howCloseIsThirdPoint, double howCloseIsForthPoint, int firstX1, int firstY1, int firstX2, int firstY2, int secondX1, int secondY1, int secondX2, int secondY2) {
        if (firstPairPointLength >= secondPairPointLength) {
            if (howCloseIsFirstPoint > howCloseIsSecondPoint) {
                System.out.printf("(%d, %d)(%d, %d)%n", firstX2, firstY2, firstX1, firstY1);
            } else {
                System.out.printf("(%d, %d)(%d, %d)%n", firstX1, firstY1, firstX2, firstY2);
            }
        } else {
            if (howCloseIsThirdPoint > howCloseIsForthPoint) {
                System.out.printf("(%d, %d)(%d, %d)%n", secondX2, secondY2, secondX1, secondY1);
            } else {
                System.out.printf("(%d, %d)(%d, %d)%n", secondX1, secondY1, secondX2, secondY2);
            }
        }
    }
}
