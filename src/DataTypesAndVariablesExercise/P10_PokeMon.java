package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int powerLeft = pokePower;
        int pokedTargets = 0;
        while (powerLeft >= distance){
            powerLeft -= distance;
            pokedTargets++;
            if (exhaustionFactor != 0){
                if (powerLeft == pokePower / 2){
                    powerLeft = powerLeft / exhaustionFactor;
                }
            }
        }
        System.out.printf("%d%n%d",powerLeft, pokedTargets);
    }
}
