import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {
    // Inner Bogie class to model passenger bogies
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
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("=====================================\n");
        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("General", 90));
        System.out.println("Before Sorting:");
        displayBogies(bogies);
        // Sort bogies by seating capacity (ascending order)
        Collections.sort(bogies, new Comparator<Bogie>() {
            @Override
            public int compare(Bogie b1, Bogie b2) {
                return Integer.compare(b1.capacity, b2.capacity);
            }
        });

        System.out.println("\nAfter Sorting by Seating Capacity:");
        displayBogies(bogies);
        System.out.println("\nUC7 bogie sorting completed...");
    }

    // Helper method to display bogie details
    private static void displayBogies(List<Bogie> bogies) {
        for (Bogie bogie : bogies) {
            System.out.println(bogie.name + " -> " + bogie.capacity);
        }
    }
}