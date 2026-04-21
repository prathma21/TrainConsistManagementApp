public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("=======================================\n");

        try {
            PassengerBogie bogie = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + bogie.type + " -> " + bogie.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PassengerBogie bogie = new PassengerBogie("General", -10);
            System.out.println("Created Bogie: " + bogie.type + " -> " + bogie.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}