public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12, LengthUnit.INCH);

        System.out.println("Equality: " + q1.equals(q2));

        QuantityLength converted = q1.convertTo(LengthUnit.INCH);
        System.out.println("Converted: " + converted);

        QuantityLength sum = q1.add(q2);
        System.out.println("Addition: " + sum);
    }
}