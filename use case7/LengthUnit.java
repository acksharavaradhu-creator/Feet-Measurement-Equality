public enum LengthUnit {

    FEET(1.0),
    INCH(1.0 / 12),
    YARD(3.0),
    CM(0.0328084);

    private double toFeet;

    LengthUnit(double toFeet) {
        this.toFeet = toFeet;
    }

    public double convertToBaseUnit(double value) {
        return value * toFeet;
    }

    public double convertFromBaseUnit(double baseValue) {
        return baseValue / toFeet;
    }
}