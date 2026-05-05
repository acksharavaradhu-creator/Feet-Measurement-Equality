public class QuantityMeasurementApp {

    // Method to check equality
    public boolean isEqual(double value1, double value2) {

        // Validation (basic check)
        if (Double.isNaN(value1) || Double.isNaN(value2)) {
            System.out.println("Invalid input");
            return false;
        }

        return value1 == value2;
    }

    public static void main(String[] args) {

        QuantityMeasurementApp app = new QuantityMeasurementApp();

        double value1 = 5.0;
        double value2 = 5.0;

        boolean result = app.isEqual(value1, value2);

        System.out.println("Are values equal? " + result);
    }
}