package MidExamPreparation;

import java.util.Scanner;

public class P04_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodInKg = Double.parseDouble(scanner.nextLine());
        double hayInKg = Double.parseDouble(scanner.nextLine());
        double coverInKg = Double.parseDouble(scanner.nextLine());
        double weightInKg = Double.parseDouble(scanner.nextLine());

        double foodInGrams = foodInKg * 1000;
        double hayInGrams = hayInKg * 1000;
        double coverInGrams = coverInKg * 1000;
        double weightInGrams = weightInKg * 1000;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;
            if (foodInGrams <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }
            if(i % 2 == 0){
                double neededHay = foodInGrams * 5 / 100;
                hayInGrams -= neededHay;
                if (hayInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            }
            if (i == 3) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                    if (coverInGrams <= 0){
                        System.out.println("Merry must go to the pet store!");
                        return;
                    }
            } else if (i == 6) {
                    double usedCover = weightInGrams / 3;
                    coverInGrams -= usedCover;
                    if (coverInGrams <= 0){
                        System.out.println("Merry must go to the pet store!");
                        return;
                    }
            } else if (i == 9) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 12) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 15) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 18) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 21) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 24) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 27) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            } else if (i == 30) {
                double usedCover = weightInGrams / 3;
                coverInGrams -= usedCover;
                if (coverInGrams <= 0){
                    System.out.println("Merry must go to the pet store!");
                    return;
                }
            }
        }
        foodInKg = foodInGrams / 1000;
        coverInKg = coverInGrams / 1000;
        hayInKg = hayInGrams / 1000;
        if (foodInKg > 0 && hayInKg > 0 && coverInKg > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInKg, hayInKg, coverInKg);
        }
    }
}
