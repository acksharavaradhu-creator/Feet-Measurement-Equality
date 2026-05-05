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

    public boolean isEqual(QuantityLength other) {
        double v1 = this.unit.toBase(this.value);
        double v2 = other.unit.toBase(other.value);
        return Math.abs(v1 - v2) < 0.0001;
    }

    // 🔥 UC6 ADD METHOD
    public QuantityLength add(QuantityLength other) {

        if (other == null) {
            throw new IllegalArgumentException("Other value cannot be null");
        }

        // Step 1: convert both to base (feet)
        double base1 = this.unit.toBase(this.value);
        double base2 = other.unit.toBase(other.value);

        // Step 2: add
        double sum = base1 + base2;

        // Step 3: convert back to FIRST unit
        double result = this.unit.fromBase(sum);

        return new QuantityLength(result, this.unit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}