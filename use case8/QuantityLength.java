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

    // ✅ Equality
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

        double v1 = this.unit.convertToBaseUnit(this.value);
        double v2 = other.unit.convertToBaseUnit(other.value);

        return Math.abs(v1 - v2) < 0.0001;
    }

    // ✅ Conversion
    public QuantityLength convertTo(LengthUnit targetUnit) {

        double base = this.unit.convertToBaseUnit(this.value);
        double result = targetUnit.convertFromBaseUnit(base);

        return new QuantityLength(result, targetUnit);
    }

    // ✅ Addition
    public QuantityLength add(QuantityLength other) {

        double base1 = this.unit.convertToBaseUnit(this.value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sum = base1 + base2;

        double result = this.unit.convertFromBaseUnit(sum);

        return new QuantityLength(result, this.unit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}