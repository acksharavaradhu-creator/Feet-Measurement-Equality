public class Quantity<U extends IMeasurable> {

    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {
        if (!Double.isFinite(value) || unit == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.value = value;
        this.unit = unit;
    }

    // ✅ Equality
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Quantity)) return false;

        Quantity<?> other = (Quantity<?>) obj;

        // prevent length vs weight comparison
        if (this.unit.getClass() != other.unit.getClass()) {
            return false;
        }

        double v1 = this.unit.convertToBaseUnit(this.value);
        double v2 = other.unit.convertToBaseUnit(other.value);

        return Math.abs(v1 - v2) < 0.0001;
    }

    // ✅ Conversion
    public Quantity<U> convertTo(U targetUnit) {

        double base = unit.convertToBaseUnit(value);
        double result = targetUnit.convertFromBaseUnit(base);

        return new Quantity<>(result, targetUnit);
    }

    // ✅ Addition (same unit as first)
    public Quantity<U> add(Quantity<U> other) {

        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sum = base1 + base2;

        double result = unit.convertFromBaseUnit(sum);

        return new Quantity<>(result, unit);
    }

    // ✅ Addition (custom unit)
    public Quantity<U> add(Quantity<U> other, U targetUnit) {

        double base1 = unit.convertToBaseUnit(value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sum = base1 + base2;

        double result = targetUnit.convertFromBaseUnit(sum);

        return new Quantity<>(result, targetUnit);
    }

    @Override
    public String toString() {
        return value + " " + unit.getUnitName();
    }
}