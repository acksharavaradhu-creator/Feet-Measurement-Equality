public class QuantityLength {

    private double value;
    private LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.value = value;
        this.unit = unit;
    }

    // Equality (from UC3/UC4)
    public boolean isEqual(QuantityLength other) {
        double v1 = this.unit.toBase(this.value);
        double v2 = other.unit.toBase(other.value);
        return Math.abs(v1 - v2) < 0.0001;
    }

    // 🔥 NEW: Conversion method
    public static double convert(double value, LengthUnit source, LengthUnit target) {

        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }

        if (source == null || target == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }

        // Step 1: convert to base (feet)
        double baseValue = source.toBase(value);

        // Step 2: convert to target
        return target.fromBase(baseValue);
    }
}