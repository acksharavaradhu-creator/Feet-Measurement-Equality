public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12, LengthUnit.INCH);

        QuantityLength result = q1.add(q2, LengthUnit.YARD);

        System.out.println("Result in YARD: " + result);
    }
}