public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12, LengthUnit.INCH);

        boolean result = q1.isEqual(q2);

        System.out.println("1 foot == 12 inches ? " + result);
    }
}