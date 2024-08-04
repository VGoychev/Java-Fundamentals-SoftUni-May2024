package FinalExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Plant> plants = new HashMap<>();
        Map<String, Integer> sectionCounts = new HashMap<>();
        Map<String, Integer> thirstySections = new HashMap<>();

        while (!input.equals("EndDay")) {
            String[] token = input.split(": ");
            String command = token[0];
            String[] action = token[1].split("-");
            String plantName = action[0];

            switch (command) {
                case "Plant":
                    int waterNeeded = Integer.parseInt(action[1]);
                    String section = action[2];

                    if (plants.containsKey(plantName)) {
                        Plant plant = plants.get(plantName);
                        plant.water += waterNeeded;
                    } else {
                        plants.put(plantName, new Plant(waterNeeded, section));
                        sectionCounts.put(section, sectionCounts.getOrDefault(section, 0) + 1);
                        thirstySections.putIfAbsent(section, 0);
                        thirstySections.put(section, thirstySections.getOrDefault(section, 0) + 1);
                    }
                    break;

                case "Water":
                    int amount = Integer.parseInt(action[1]);

                    if (plants.containsKey(plantName)) {
                        Plant plant = plants.get(plantName);
                        plant.water -= amount;

                        if (plant.water <= 0) {
                            plants.remove(plantName);
                            System.out.printf("%s has been sufficiently watered.%n", plantName);
                            String plantSection = plant.section;

                            sectionCounts.put(plantSection, sectionCounts.get(plantSection) - 1);

                            if (sectionCounts.get(plantSection) == 0) {
                                sectionCounts.remove(plantSection);
                                thirstySections.remove(plantSection);
                            } else {
                                if (thirstySections.containsKey(plantSection)) {
                                    thirstySections.put(plantSection, thirstySections.get(plantSection) - 1);
                                    if (thirstySections.get(plantSection) == 0) {
                                        thirstySections.remove(plantSection);
                                    }
                                }
                            }
                        } else {
                            String plantSection = plant.section;
                            thirstySections.put(plantSection, thirstySections.getOrDefault(plantSection, 0));
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println("Plants needing water:");
        for (Map.Entry<String, Plant> entry : plants.entrySet()) {
            String plantName = entry.getKey();
            Plant plant = entry.getValue();
            System.out.printf(" %s -> %dml left%n", plantName, plant.water);
        }

        System.out.println("Sections with thirsty plants:");
        for (Map.Entry<String, Integer> entry : thirstySections.entrySet()) {
            String section = entry.getKey();
            int count = entry.getValue();
            if (count > 0) {
                System.out.printf(" %s: %d%n", section, count);
            }
        }
    }

    static class Plant {
        int water;
        String section;

        Plant(int water, String section) {
            this.water = water;
            this.section = section;
        }
    }
}


