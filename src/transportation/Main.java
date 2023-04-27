package transportation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> vehicles = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Display vehicles");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Select vehicle type:");
                    System.out.println("1. Jeep");
                    System.out.println("2. Frigate");
                    System.out.println("3. Spy Glider");
                    System.out.println("4. Toy Glider");

                    int vehicleType = scanner.nextInt();
                    switch (vehicleType) {
                        case 1:
                            System.out.println("Enter model, average fuel consumption, max speed, and engine lifetime:");
                            String jeepModel = scanner.next();
                            double jeepAvgFuel = scanner.nextDouble();
                            double jeepMaxSpeed = scanner.nextDouble();
                            double jeepEngineLifetime = scanner.nextDouble();
                            vehicles.add(new Jeep(jeepModel, jeepAvgFuel, jeepMaxSpeed, jeepEngineLifetime));
                            break;

                        case 2:
                            System.out.println("Enter model, max passengers, max speed, and with wind (true/false):");
                            String frigateModel = scanner.next();
                            int frigateMaxPassengers = scanner.nextInt();
                            double frigateMaxSpeed = scanner.nextDouble();
                            boolean frigateWithWind = scanner.nextBoolean();
                            vehicles.add(new Frigate(frigateModel, frigateMaxPassengers, frigateMaxSpeed, frigateWithWind));
                            break;

                        case 3:
                            System.out.println("Enter distance and max speed:");
                            double spyGliderDistance = scanner.nextDouble();
                            double spyGliderMaxSpeed = scanner.nextDouble();
                            vehicles.add(new SpyGlider(spyGliderDistance, spyGliderMaxSpeed));
                            break;

                        case 4:
                            System.out.println("Enter distance and max speed:");
                            double toyGliderDistance = scanner.nextDouble();
                            double toyGliderMaxSpeed = scanner.nextDouble();
                            vehicles.add(new ToyGlider(toyGliderDistance, toyGliderMaxSpeed));
                            break;

                        default:
                            System.out.println("Invalid vehicle type.");
                    }
                    break;

                case 2:
                    for (Object vehicle : vehicles) {
                        System.out.println(vehicle.toString());
                    }
                    break;

                case 3:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
