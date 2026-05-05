public class QuantityMeasurementApp {
    public static void main(String[] args) {
        QuantityLength yard = new QuantityLength(1, LengthUnit.YARD);
        QuantityLength feet = new QuantityLength(3, LengthUnit.FEET);
        System.out.println("1 yard equals 3 feet: " + yard.isEqual(feet));

        QuantityLength inch = new QuantityLength(36, LengthUnit.INCH);
        System.out.println("1 yard equals 36 inches: " + yard.isEqual(inch));

        QuantityLength cm = new QuantityLength(91.44, LengthUnit.CM); // 36 inches * 2.54
        System.out.println("36 inches equals 91.44 cm: " + inch.isEqual(cm));
    }
}