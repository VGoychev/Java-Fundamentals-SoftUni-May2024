package ObjectsAndClassesExercise.P05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        double sumCarsHorsePower = 0.0;
        double sumTrucksHorsePower = 0.0;
        int countCars = 0;
        int countTrucks = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            String[] inputTokens = input.split(" ");
            String typeOfVehicle = inputTokens[0];
            String modelOfVehicle = inputTokens[1];
            String colorOfVehicle = inputTokens[2];
            double horsePowerOfVehicle = Double.parseDouble(inputTokens[3]);

            Vehicle currentVehicle = new Vehicle();
            if (typeOfVehicle.equals("car")){
                typeOfVehicle = "Car";
                sumCarsHorsePower += horsePowerOfVehicle;
                countCars++;
            } else {
                typeOfVehicle = "Truck";
                sumTrucksHorsePower += horsePowerOfVehicle;
                countTrucks++;
            }

            currentVehicle.setType(typeOfVehicle);
            currentVehicle.setModel(modelOfVehicle);
            currentVehicle.setColor(colorOfVehicle);
            currentVehicle.setHorsePower(horsePowerOfVehicle);

            vehicles.add(currentVehicle);

        }
        Double averageHpCar = (countCars > 0) ? (sumCarsHorsePower / countCars) : 0.0;
        Double averageHpTruck = (countTrucks > 0) ? (sumTrucksHorsePower / countTrucks) : 0.0;
            if (averageHpTruck.equals("NaN")){
                averageHpTruck = 0.0;
            }
        while (true){
            String input = scanner.nextLine();
            if (input.equals("Close the Catalogue")){
                break;
            }
            for (Vehicle vehicle : vehicles){
                if (vehicle.getModel().equals(input)){
                    System.out.printf("Type: %s%n", vehicle.getType());
                    System.out.printf("Model: %s%n", vehicle.getModel());
                    System.out.printf("Color: %s%n", vehicle.getColor());
                    System.out.printf("Horsepower: %.0f%n", vehicle.getHorsePower());
                }
            }

        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHpCar);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHpTruck);
    }
}
