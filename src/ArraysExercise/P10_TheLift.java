package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int [] lift = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int peopleLeft = people;
        for (int i = 0; i < lift.length; i++) {
            int peopleInCurrentLift = 0;
            if (peopleLeft >= 4) {
                if (lift[i] == 4) {
                    peopleInCurrentLift = 0;
                } else if (lift[i] == 3) {
                    peopleInCurrentLift = 1;
                } else if (lift[i] == 2){
                    peopleInCurrentLift = 2;
                } else if (lift[i] == 1){
                    peopleInCurrentLift = 3;
                } else if (lift[i] == 0){
                    peopleInCurrentLift = 4;
                }
            } else if (peopleLeft == 3) {
                if (lift[i] == 4) {
                    peopleInCurrentLift = 0;
                } else if (lift[i] == 3) {
                    peopleInCurrentLift = 1;
                } else if (lift[i] == 2){
                    peopleInCurrentLift = 2;
                } else if (lift[i] == 1){
                    peopleInCurrentLift = 3;
                } else if (lift[i] == 0){
                    peopleInCurrentLift = 3;
                }
            } else if (peopleLeft == 2) {
                if (lift[i] == 4) {
                    peopleInCurrentLift = 0;
                } else if (lift[i] == 3) {
                    peopleInCurrentLift = 1;
                } else if (lift[i] == 2){
                    peopleInCurrentLift = 2;
                } else if (lift[i] == 1){
                    peopleInCurrentLift = 2;
                } else if (lift[i] == 0){
                    peopleInCurrentLift = 2;
                }
            } else if (peopleLeft == 1) {
                if (lift[i] == 4) {
                    peopleInCurrentLift = 0;
                } else if (lift[i] == 3) {
                    peopleInCurrentLift = 1;
                } else if (lift[i] == 2){
                    peopleInCurrentLift = 1;
                } else if (lift[i] == 1){
                    peopleInCurrentLift = 1;
                } else if (lift[i] == 0){
                    peopleInCurrentLift = 1;
                }
                } else if (peopleLeft == 0) {
                    break;
                }
                lift[i] = lift[i] + peopleInCurrentLift;
                peopleLeft -= peopleInCurrentLift;
            }
        boolean isHaveFreeSlots = false;
        for (int i = 0; i < lift.length ; i++) {
            if (lift[i] < 4) {
                isHaveFreeSlots = true;
                break;
            }
        }
        if (peopleLeft == 0 && !isHaveFreeSlots) {

        } else if (isHaveFreeSlots) {
            System.out.printf("The lift has empty spots!%n");
        } else if (!isHaveFreeSlots){
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleLeft);
        }
        for (int wagon : lift){
            System.out.print(wagon + " ");
        }
    }
}
