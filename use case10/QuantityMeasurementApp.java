public class QuantityMeasurementApp {

    public static void main(String[] args) {

        // ✅ Length
        Quantity<LengthUnit> l1 = new Quantity<>(1, LengthUnit.FEET);
        Quantity<LengthUnit> l2 = new Quantity<>(12, LengthUnit.INCH);

        System.out.println("Length equal: " + l1.equals(l2));

        // ✅ Weight
        Quantity<WeightUnit> w1 = new Quantity<>(1, WeightUnit.KG);
        Quantity<WeightUnit> w2 = new Quantity<>(1000, WeightUnit.GRAM);

        System.out.println("Weight equal: " + w1.equals(w2));

        // ✅ Addition
        Quantity<LengthUnit> sum = l1.add(l2);
        System.out.println("Sum: " + sum);

        // ✅ Conversion
        System.out.println("Converted: " + l1.convertTo(LengthUnit.INCH));
    }
}
