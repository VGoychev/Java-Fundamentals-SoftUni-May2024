package MethodsMoreExercises;

import java.util.Scanner;

public class P02_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        printClosest(x1,y1,x2,y2);
    }
    public static void printClosest(int x1, int y1,int x2,int y2){
        int absX1 = Math.abs(x1);
        int absX2 = Math.abs(x2);
        int absY1 = Math.abs(y1);
        int absY2 = Math.abs(y2);
        if (absX1 + absY1 > absX2 + absY2){
            System.out.printf("(%d, %d)%n", x2,y2);
        } else {
            System.out.printf("(%d, %d)%n", x1,y1);
        }
    }
}
