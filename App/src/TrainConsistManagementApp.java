import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Reusing Bogie model from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("=====================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        bogies.forEach(b ->
                System.out.println(b.name + " -> " + b.capacity)
        );

        System.out.println("\nFiltered Bogies (Capacity > 60):");

        // Stream filtering based on seating capacity
        bogies.stream()
                .filter(b -> b.capacity > 60)
                .forEach(b ->
                        System.out.println(b.name + " -> " + b.capacity)
                );
    }
}