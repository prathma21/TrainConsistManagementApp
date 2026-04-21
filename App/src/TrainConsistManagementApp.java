public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Rectangular bogie cannot carry petroleum");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo assignment process completed.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC15 - Safe Cargo Assignment Using Try-Catch-Finally ");
        System.out.println("============================================\n");

        GoodsBogie bogie = new GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie safeBogie = new GoodsBogie("Cylindrical");
        safeBogie.assignCargo("Petroleum");
    }
}