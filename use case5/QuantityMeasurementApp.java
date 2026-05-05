public class QuantityMeasurementApp {

    public static void main(String[] args) {

        double feetToInch = QuantityLength.convert(1, LengthUnit.FEET, LengthUnit.INCH);
        System.out.println("1 foot in inches = " + feetToInch);

        double yardToFeet = QuantityLength.convert(1, LengthUnit.YARD, LengthUnit.FEET);
        System.out.println("1 yard in feet = " + yardToFeet);

        double cmToFeet = QuantityLength.convert(100, LengthUnit.CM, LengthUnit.FEET);
        System.out.println("100 cm in feet = " + cmToFeet);
    }
}