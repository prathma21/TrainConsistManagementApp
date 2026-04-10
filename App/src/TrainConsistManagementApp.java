import java.util.HashSet;
import java.util.Set;
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=====================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (ignored automatically)
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        // ---- DISPLAY UNIQUE BOGIE IDs ----
        System.out.println("Final Train Bogie IDs (Unique):");
        System.out.println(bogies);

    }
}