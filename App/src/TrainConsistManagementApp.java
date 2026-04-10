import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Code ");
        System.out.println("=====================================\n");

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex rules
        String trainIdRegex = "^TRN-\\d{4}$";
        String cargoCodeRegex = "^[A-Z]{3}-[A-Z]{2}$";

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
    }
}