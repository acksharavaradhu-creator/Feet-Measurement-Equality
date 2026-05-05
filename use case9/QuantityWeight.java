public class QuantityWeight {

    private double value;
    private WeightUnit unit;

    public QuantityWeight(double value, WeightUnit unit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.value = value;
        this.unit = unit;
    }

    // ✅ Equality
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof QuantityWeight)) return false;

        QuantityWeight other = (QuantityWeight) obj;

        double v1 = this.unit.toBase(this.value);
        double v2 = other.unit.toBase(other.value);

        return Math.abs(v1 - v2) < 0.0001;
    }

    // ✅ Conversion
    public QuantityWeight convertTo(WeightUnit targetUnit) {

        double base = this.unit.toBase(this.value);
        double result = targetUnit.fromBase(base);

        return new QuantityWeight(result, targetUnit);
    }

    // ✅ Addition
    public QuantityWeight add(QuantityWeight other) {

        double base1 = this.unit.toBase(this.value);
        double base2 = other.unit.toBase(other.value);

        double sum = base1 + base2;

        double result = this.unit.fromBase(sum);

        return new QuantityWeight(result, this.unit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}