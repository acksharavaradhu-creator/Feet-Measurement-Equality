public class QuantityMeasurementApp {

    public static void main(String[] args) {

        // ✅ Equality
        QuantityWeight w1 = new QuantityWeight(1, WeightUnit.KG);
        QuantityWeight w2 = new QuantityWeight(1000, WeightUnit.GRAM);

        System.out.println("1 kg == 1000 g ? " + w1.equals(w2));

        // ✅ Conversion
        QuantityWeight converted = w1.convertTo(WeightUnit.POUND);
        System.out.println("1 kg in pounds = " + converted);

        // ✅ Addition
        QuantityWeight w3 = new QuantityWeight(1, WeightUnit.KG);
        QuantityWeight w4 = new QuantityWeight(500, WeightUnit.GRAM);

        QuantityWeight result = w3.add(w4);
        System.out.println("1 kg + 500 g = " + result);
    }
}