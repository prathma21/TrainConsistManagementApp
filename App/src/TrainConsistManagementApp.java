import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("========================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        Arrays.sort(bogieIds);

        String key = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (bogieIds[mid].equals(key)) {
                found = true;
                break;
            } else if (bogieIds[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Bogie " + key + " found using binary search.");
        } else {
            System.out.println("Bogie " + key + " not found using binary search.");
        }
    }
}