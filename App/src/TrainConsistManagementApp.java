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
public class TrainConsistManagementApp {

    public static void main(String[] args) {

feature/UC6-MapBogietoCapacity
        System.out.println("=====================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("====================================");
 feature/UC5-PreserveInsertionOrderofBogies
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
dev
        System.out.println("=====================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:\n");

        // Display bogie capacities
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

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
    }
}