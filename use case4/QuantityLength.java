public class QuantityLength {
    private double value;
    private LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean isEqual(QuantityLength other) {
        double thisInBase = this.value * this.unit.getConversionFactor();
        double otherInBase = other.value * other.unit.getConversionFactor();
        return Math.abs(thisInBase - otherInBase) < 0.0001;
    }
}