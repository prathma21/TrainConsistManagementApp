feature/UC11-ValidateTrainIDCargoCodes
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TrainConsistManagementApp {

=======
 feature/UC9-GroupBogiesbyType
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

feature/UC10-CountTotalSeatsinTrain
    // Reusing Bogie model

    // Reusing Bogie model from UC7 / UC8

feature/UC7-SortBogiesbyCapacity
import java.util.ArrayList;
import java.util.List;

feature/UC6-MapBogietoCapacity
import java.util.HashMap;
import java.util.Map;

 feature/UC5-PreserveInsertionOrderofBogies
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =====================================
 * MAIN CLASS - TrainConsistManagementApp
 * =====================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class demonstrates how LinkedHashSet preserves
 * insertion order while automatically enforcing uniqueness.
 *
 * At this stage, the application:
 * - Maintains insertion sequence
 * - Prevents duplicate bogie entries
 * - Displays final ordered train formation
 *
 * @author Developer
 * @version 5.0
import java.util.LinkedList;
import java.util.List;

/**
 * =====================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * =====================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * At this stage, the application:
 * - Adds bogies in sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 *
 * This maps positional operations using LinkedList.
 *
 * @author Developer
 * @version 4.0
 dev
 */
 dev
dev
public class TrainConsistManagementApp {

    // Reusing Bogie model from UC7
dev
dev
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

feature/UC9-GroupBogiesbyType
dev
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Code ");
        System.out.println("=====================================\n");
feature/UC11-ValidateTrainIDCargoCodes
        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex rules
        String trainIdRegex = "^TRN-\\d{4}$";
        String cargoCodeRegex = "^[A-Z]{3}-[A-Z]{2}$";
        // Create list of bogies

feature/UC7-SortBogiesbyCapacity
    public static void main(String[] args) {

        System.out.println("=====================================");
feature/UC8-FilterPassengerBogiesUsingStreams
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");

        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
feature/UC6-MapBogietoCapacity
        System.out.println("=====================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("====================================");
 feature/UC5-PreserveInsertionOrderofBogies
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
dev
dev
dev
        System.out.println("=====================================\n");

        // Create list of passenger bogies
 dev
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
feature/UC9-GroupBogiesbyType
        bogies.add(new Bogie("Sleeper", 70));
dev

        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);

        boolean isTrainIdValid = trainIdMatcher.matches();
        boolean isCargoCodeValid = cargoCodeMatcher.matches();

        System.out.println("\nValidation Results:");

        if (isTrainIdValid) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format.");
        }
feature/UC11-ValidateTrainIDCargoCodes
        if (isCargoCodeValid) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format.");
        }

        if (isTrainIdValid && isCargoCodeValid) {
            System.out.println("\nInput validation successful. Safe to proceed.");
        } else {
            System.out.println("\nInput validation failed. Please correct the data.");
        }

        scanner.close();
 feature/UC10-CountTotalSeatsinTrain
        // -------- AGGREGATE USING REDUCE --------
        // map() extracts capacity
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display total
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);
        // -------- GROUP USING COLLECTORS.GROUPINGBY --------
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped structure
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  Capacity: " + b.capacity);
            }
        }
        bogies.add(new Bogie("General", 90));

feature/UC8-FilterPassengerBogiesUsingStreams
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
    // Helper method to display bogie details
    private static void displayBogies(List<Bogie> bogies) {
        for (Bogie bogie : bogies) {
            System.out.println(bogie.name + " -> " + bogie.capacity);
        }
feature/UC7-SortBogiesbyCapacity


feature/UC6-MapBogietoCapacity

        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");

        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        // Create a LinkedList to maintain order
        List<String> trainConsist = new LinkedList<>();

        // Initial bogie sequence
        addUnique(trainConsist, "Engine");
        addUnique(trainConsist, "Sleeper");
        addUnique(trainConsist, "AC");
        addUnique(trainConsist, "Cargo");
        addUnique(trainConsist, "Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // Insert Pantry Car at position 2
        addUniqueAtPosition(trainConsist, 2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // Remove first and last bogies
        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }

    // Ensures uniqueness while adding
    private static void addUnique(List<String> list, String bogie) {
        if (!list.contains(bogie)) {
            list.add(bogie);
        }
    }

    // Ensures uniqueness while inserting at position
    private static void addUniqueAtPosition(List<String> list, int index, String bogie) {
        if (!list.contains(bogie)) {
            list.add(index, bogie);
        }
    dev
dev
dev
dev
      dev
dev
dev
    }
}