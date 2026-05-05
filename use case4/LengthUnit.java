public enum LengthUnit {
    FEET(12),
    INCH(1),
    YARD(36),
    CM(1 / 2.54);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}