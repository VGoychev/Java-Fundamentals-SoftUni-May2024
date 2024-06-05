package MethodsExercise;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        smallestNumber(first,second,third);
    }
    static void smallestNumber(int a, int b, int c){
        if ( a < b && a < c){
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }
    }
}
