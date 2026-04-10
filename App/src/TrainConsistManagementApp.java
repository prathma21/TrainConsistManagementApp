import java.util.ArrayList;
import java.util.List;

/**
 * =====================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * =====================================
 *
 * Use Case 10: Count Total Seats in Train
 *
 * Description:
 * This class aggregates seating capacities
 * using Java Stream reduce().
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Streams bogie capacities
 * - Reduces them into a single total value
 * - Displays total seating capacity
 *
 * This maps aggregation logic using reduce().
 *
 * author Developer
 * version 10.0
 */
public class TrainConsistManagementApp {

    // Reusing Bogie model
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
        System.out.println(" UC10 - Count Total Seats in Train ");
        System.out.println("=====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // -------- AGGREGATE USING REDUCE --------
        // map() extracts capacity
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display total
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
    }
}