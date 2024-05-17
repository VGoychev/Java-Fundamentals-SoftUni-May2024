package ProgramingBasicsOverviewExercise;

import java.util.Scanner;

public class P08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (current != rows) {
                    current++;
                }
                System.out.print(current + " ");
                if(current > n){
                    break;
                }
            }
            if(current>n){
                break;
            }
            System.out.println();
        }
    }
}
