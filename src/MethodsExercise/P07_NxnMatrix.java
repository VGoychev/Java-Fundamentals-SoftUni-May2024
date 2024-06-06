package MethodsExercise;

import java.util.Scanner;

public class P07_NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    static void printMatrix(int a){
        for (int row = 1; row <= a; row++) {
            for (int column = 1; column <= a; column++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
