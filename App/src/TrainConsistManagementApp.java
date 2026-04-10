import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("=====================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        //CREATE (Add bogies)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair Car");
        passengerBogies.add("General");
        passengerBogies.add("Pantry");

        System.out.println("Initial Train Consist: " + passengerBogies);

        //READ (Check availability)
        String bogieToCheck = "AC Chair Car";
        if (passengerBogies.contains(bogieToCheck)) {
            System.out.println("Bogie '" + bogieToCheck + "' is available in the train.");
        } else {
            System.out.println("Bogie '" + bogieToCheck + "' is NOT available.");
        }

        //UPDATE (Insert at specific position)
        passengerBogies.add(2, "First Class");
        System.out.println("After inserting 'First Class' at position 2: " + passengerBogies);

        //DELETE (Remove bogies)
        passengerBogies.remove("Pantry");
        System.out.println("After removing 'Pantry': " + passengerBogies);

        passengerBogies.remove(0); // remove by index
        System.out.println("After removing bogie at index 0: " + passengerBogies);

        //FINAL DISPLAY
        System.out.println("\nFinal Train Consist: " + passengerBogies);

    }
}
