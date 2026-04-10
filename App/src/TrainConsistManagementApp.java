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
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=====================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies (duplicates will be ignored automatically)
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate entries (ignored)
        formation.add("Sleeper");
        formation.add("Cargo");

        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");
    }
}