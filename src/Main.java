import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("amount of entries: ");
        int amountOfEntries = scanner.nextInt();
        System.out.println();

        HashMap<String, Integer> manufacturerKey = new HashMap<>();
        manufacturerKey.putIfAbsent("Audi", 0);
        manufacturerKey.putIfAbsent("BMW", 10);
        manufacturerKey.putIfAbsent("Ford", 20);
        manufacturerKey.putIfAbsent("Mercedes", 30);
        manufacturerKey.putIfAbsent("Tesla", 40);
        manufacturerKey.putIfAbsent("Volkswagen", 50);

        String[] vin = new String[amountOfEntries];
        String[] manufacturer = new String[amountOfEntries];
        Vehicle[] vehicles = new Vehicle[amountOfEntries];

        System.out.printf("enter vin numbers: %n");
        for (int i = 0; i < amountOfEntries; i++) {
            vin[i] = (scanner.next());
        }

        System.out.printf("%nenter manufacturer numbers: %n");
        for (int i = 0; i < amountOfEntries; i++) {
            manufacturer[i] = (scanner.next());
        }

        scanner.close();
        System.out.println();

        for (int i = 0; i < amountOfEntries; i++) {
            vehicles[i] = new Vehicle(vin[i], manufacturer[i]);
        }

        System.out.println();

        for (Vehicle vehicle : vehicles) {
            for (Integer option : vehicle.getOptions()) {
                System.out.printf("%s,%d,%s\n", vehicle.getManufacturer(), manufacturerKey.get(vehicle.getManufacturer()) + option, vehicle.getVin());
            }
        }

    }
}
