public class QuantityLength {
    private double value;
    private Unit unit;

    public QuantityLength(double value, Unit unit) {
        if (Double.isNaN(value)) {
            throw new IllegalArgumentException("Value must be a valid number");
        }
        this.value = value;
        this.unit = unit;
    }

    public boolean isEqual(QuantityLength other) {
        double thisInFeet = this.value * this.unit.getConversionToFeet();
        double otherInFeet = other.value * other.unit.getConversionToFeet();
        return Math.abs(thisInFeet - otherInFeet) < 0.0001;
    }
}