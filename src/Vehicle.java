import java.util.*;

public class Vehicle {
    private static final Random RNG = new Random();

    private final String vin;
    private final String manufacturer;
    private final List<Integer> options;

    public Vehicle(String vin, String manufacturer) {
        this.vin = vin;
        this.manufacturer = manufacturer;
        int numberOfOptions = (int) (Math.random() * 11);
        this.options = new LinkedList<>();
        generateOptionIndex(numberOfOptions);
    }

    private void generateOptionIndex(int numberOfOptions) {
        System.out.printf("%s: %d%n", vin, numberOfOptions);

        Set<Integer> generated = new LinkedHashSet<>();
        while (generated.size() < numberOfOptions) {
            Integer next = RNG.nextInt(numberOfOptions) + 1;
            generated.add(next);
        }
        options.addAll(generated);
        options.sort(Integer::compareTo);
    }

    public String getVin() {
        return vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public List<Integer> getOptions() {
        return options;
    }
}
