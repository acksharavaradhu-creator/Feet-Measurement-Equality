public enum Unit {
    FEET(1),
    INCHES(1.0 / 12);

    private final double conversionToFeet;

    Unit(double conversionToFeet) {
        this.conversionToFeet = conversionToFeet;
    }

    public double getConversionToFeet() {
        return conversionToFeet;
    }
}